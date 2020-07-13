package org.runion.marshallmellow.codecs;

import org.runion.marshallmellow.model.Codec;
import org.runion.marshallmellow.model.Marshalled;

import java.nio.ByteBuffer;

public class UnsignedIntCodec implements Codec<Long> {
    @Override
    public void encode(Object sourceObject, Long sourceField, Marshalled annotation, ByteBuffer buffer) {
        buffer.putInt(sourceField.intValue());
    }

    @Override
    public Long decode(Object targetObject, Long targetField, Marshalled annotation, ByteBuffer buffer) {
        return Integer.toUnsignedLong(buffer.getInt());
    }
}
