package com.qianzhui.enode.common.thirdparty.gson;

import com.qianzhui.enode.common.serializing.IJsonSerializer;

/**
 * Created by junbo_xu on 2016/3/2.
 */
public class GsonJsonSerializer extends AbstractSerializer implements IJsonSerializer {
    public GsonJsonSerializer() {
        super(false,false);
    }

    @Override
    public String serialize(Object obj) {
        return this.gson().toJson(obj);
    }

    @Override
    public <T> T deserialize(String aSerialization, Class<T> aType) {
        return this.gson().fromJson(aSerialization, aType);
    }
}
