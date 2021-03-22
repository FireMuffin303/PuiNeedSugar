package com.firemuffin303.puineedssugar.regitry;

import com.firemuffin303.puineedssugar.PuiNeedsSugar;
import com.firemuffin303.puineedssugar.entity.PuiEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntity {
    public static final EntityType PUI;

    public static void init(){
        Registry.register(Registry.ENTITY_TYPE,new Identifier(PuiNeedsSugar.MODID,"pui"),PUI);
        FabricDefaultAttributeRegistry.register(PUI,PuiEntity.createMobAttributes());
    }

static {
    PUI = FabricEntityTypeBuilder.<PuiEntity>create(SpawnGroup.CREATURE,(type, world) -> new PuiEntity(type,world)).dimensions(EntityDimensions.fixed(0.75f,0.75f)).trackRangeBlocks(10).trackedUpdateRate(10).build();
}
}

