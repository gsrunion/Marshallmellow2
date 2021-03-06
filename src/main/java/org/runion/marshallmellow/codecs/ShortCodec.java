package org.runion.marshallmellow.codecs;

import org.runion.marshallmellow.model.Codec;
import org.runion.marshallmellow.model.Marshalled;

import java.nio.ByteBuffer;

public class ShortCodec implements Codec<Short> {
    @Override
    public void encode(Object sourceObject, Short sourceField, Marshalled annotation, ByteBuffer buffer) {
        buffer.putShort(sourceField);
    }

    @Override
    public Short decode(Object targetObject, Short targetField, Marshalled annotation, ByteBuffer buffer) {
        return buffer.getShort();
    }
}
