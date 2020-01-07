package rocks.cleanstone.net.minecraft.protocol.v1_13.outbound;

import io.netty.buffer.ByteBuf;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rocks.cleanstone.game.block.state.mapping.BlockStateMapping;
import rocks.cleanstone.net.minecraft.chunk.ChunkDataEncoder;
import rocks.cleanstone.net.minecraft.packet.outbound.ChunkDataPacket;
import rocks.cleanstone.net.protocol.OutboundPacketCodec;

import java.io.IOException;

@Component
public class ChunkDataCodec implements OutboundPacketCodec<ChunkDataPacket> {

    private final BlockStateMapping<Integer> blockStateMapping;
    private final ChunkDataEncoder chunkDataEncoder;

    public ChunkDataCodec(@Qualifier("chunkDataEncoder_v1_13") ChunkDataEncoder chunkDataEncoder,
                          @Qualifier("protocolBlockStateMapping_v1_13") BlockStateMapping<Integer> blockStateMapping) {
        this.blockStateMapping = blockStateMapping;
        this.chunkDataEncoder = chunkDataEncoder;
    }

    @Override
    public ByteBuf encode(ByteBuf byteBuf, ChunkDataPacket packet) throws IOException {
        ByteBuf encoded = chunkDataEncoder.encode(packet, blockStateMapping, 14);
        byteBuf.writeBytes(encoded);

        return byteBuf;
    }
}
