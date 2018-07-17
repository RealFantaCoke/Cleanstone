package rocks.cleanstone.game.world.region;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Collection;
import java.util.Collections;

import javax.annotation.Nullable;

import rocks.cleanstone.game.world.chunk.ChunkProvider;

/**
 * Manages a single region in the world to rule them all
 */
public class SingleRegionManager implements RegionManager {

    private final ChunkProvider chunkProvider;
    private Region region;

    public SingleRegionManager(ChunkProvider chunkProvider) {
        this.chunkProvider = chunkProvider;
    }

    @Override
    public Collection<Region> getLoadedRegions() {
        return region != null ? Collections.singleton(region) : Collections.emptySet();
    }

    @Nullable
    @Override
    public Region getLoadedRegion(int chunkX, int chunkY) {
        return region;
    }

    @Override
    public ListenableFuture<Region> loadRegion(int chunkX, int chunkY) {
        region = new SimpleRegion("SingleR", new LocalRegionWorker(), chunkProvider);
        return new AsyncResult<>(region);
    }

    @Override
    public ListenableFuture<Region> getRegion(int chunkX, int chunkY) {
        Region region = getLoadedRegion(chunkX, chunkY);
        if (region != null) return new AsyncResult<>(region);
        return loadRegion(chunkX, chunkY);
    }

    @Override
    public void unloadRegion(Region region) {
        this.region = null;
    }
}