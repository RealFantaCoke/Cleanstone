package rocks.cleanstone.game.world.region;

import org.springframework.util.concurrent.ListenableFuture;
import rocks.cleanstone.game.world.region.chunk.Chunk;

public interface RegionWorker {
    ListenableFuture<Chunk> loadChunk(int x, int z);

    void unloadChunk(int x, int z);
}
