package io.zksync.sdk.zkscrypto.lib.entity;

import com.sun.jna.Structure;
import io.zksync.sdk.zkscrypto.lib.ZksCryptoStruct;

public class ZksRescueHashOrders extends ZksCryptoStruct {

    public static final Integer RESCUE_HASH_LEN = 31;

    public static class ByReference extends ZksRescueHashOrders implements Structure.ByReference { }
    
    private ZksRescueHashOrders() {
        super(new byte[RESCUE_HASH_LEN]);
    }

}
