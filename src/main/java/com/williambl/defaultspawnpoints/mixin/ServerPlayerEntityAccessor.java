package com.williambl.defaultspawnpoints.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ServerPlayerEntity.class)
public interface ServerPlayerEntityAccessor {
    @Accessor("spawnPointDimension")
    void setSpawnPointDimension(RegistryKey<World> dim);
}
