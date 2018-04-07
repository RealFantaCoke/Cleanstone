package rocks.cleanstone.region;

import rocks.cleanstone.region.chunk.Chunk;

import java.util.Collection;
import java.util.concurrent.Future;

public interface Region {
    Collection<Chunk> getLoadedChunks();
    Future<Chunk> loadChunk(int x, int y);
    Chunk getChunk(int x, int y);
}
