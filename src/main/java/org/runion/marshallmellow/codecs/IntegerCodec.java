package org.runion.marshallmellow.codecs;


import org.runion.marshallmellow.model.Codec;
import org.runion.marshallmellow.model.Marshalled;

import java.nio.ByteBuffer;

public class IntegerCodec implements Codec<Integer> {
    @Override
    public void encode(Object sourceObject, Integer sourceField, Marshalled annotation, ByteBuffer buffer) {
        buffer.putInt(sourceField);
    }

    @Override
    public Integer decode(Object targetObject, Integer targetField, Marshalled annotation, ByteBuffer buffer) {
        return buffer.getInt();
    }
}
