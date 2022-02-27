package io.github.cleanroommc.multiblocked.api.pattern.predicates;

import io.github.cleanroommc.multiblocked.api.pattern.util.BlockInfo;
import net.minecraft.block.Block;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class PredicateBlocks extends SimplePredicate {
    public Block[] blocks;
    
    public PredicateBlocks() {
        super("blocks");
    }
    
    public PredicateBlocks(Block... blocks) {
        this();
        this.blocks = blocks;
        buildObjectFromJson();
    }

    @Override
    public SimplePredicate buildObjectFromJson() {
        predicate = state -> ArrayUtils.contains(blocks, state.getBlockState().getBlock());
        candidates = () -> Arrays.stream(blocks).map(block -> new BlockInfo(block.getDefaultState(), null)).toArray(BlockInfo[]::new);
        return this;
    }
}
