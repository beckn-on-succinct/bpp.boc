package in.succinct.bpp.boc.extensions;

import com.venky.core.util.ObjectHolder;
import com.venky.extension.Extension;
import com.venky.extension.Registry;
import in.succinct.bpp.core.adaptor.NetworkApiAdaptor;
import in.succinct.onet.boc.extensions.BecknRegistry;
import in.succinct.onet.core.adaptor.NetworkAdaptor;


public class BocApiAdaptorCreator implements Extension {
    static {
        Registry.instance().registerExtension(NetworkApiAdaptor.class.getName(),new BocApiAdaptorCreator());
    }

    @Override
    public void invoke(Object... objects) {
        NetworkAdaptor adaptor= (NetworkAdaptor) objects[0];
        @SuppressWarnings("unchecked")
        ObjectHolder<NetworkApiAdaptor> h = (ObjectHolder<NetworkApiAdaptor>) objects[1];
        if (adaptor instanceof BecknRegistry){
            NetworkApiAdaptor networkApiAdaptor = new BocApiAdaptor((BecknRegistry) adaptor);
            h.set(networkApiAdaptor);
        }

    }
}
