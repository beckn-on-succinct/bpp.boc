package in.succinct.bpp.boc.extensions;

import com.venky.extension.Extension;
import com.venky.extension.Registry;
import in.succinct.bpp.core.adaptor.NetworkApiAdaptor;
import in.succinct.onet.boc.extensions.BecknRegistry;
import in.succinct.onet.core.adaptor.NetworkAdaptor;

public class BocApiAdaptor extends NetworkApiAdaptor {
    BocApiAdaptor(BecknRegistry networkAdaptor) {
        super(networkAdaptor);
    }

}
