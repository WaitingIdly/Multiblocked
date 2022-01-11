package io.github.cleanroommc.multiblocked.api.definition.functions;

import io.github.cleanroommc.multiblocked.api.pattern.BlockPattern;
import io.github.cleanroommc.multiblocked.api.tile.ControllerTileEntity;

public interface IPatternSupplier {
    BlockPattern getPattern(ControllerTileEntity controllerTileEntity);
}