package org.runion.marshallmellow.codecs;

import org.runion.marshallmellow.model.Codec;
import org.runion.marshallmellow.model.Marshalled;

import java.nio.ByteBuffer;

public class ByteCodec implements Codec<Byte> {
    @Override
    public void encode(Object me, Byte value, Marshalled annotation, ByteBuffer buffer) {
        buffer.put(value.byteValue());
    }

    @Override
    public Byte decode(Object me, Byte value, Marshalled annotation, ByteBuffer buffer) {
        return buffer.get();
    }
}
