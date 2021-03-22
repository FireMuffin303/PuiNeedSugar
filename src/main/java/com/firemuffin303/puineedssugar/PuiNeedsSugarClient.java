package com.firemuffin303.puineedssugar;

import com.firemuffin303.puineedssugar.client.render.PuiEntityRenderer;
import com.firemuffin303.puineedssugar.regitry.ModEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class PuiNeedsSugarClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(ModEntity.PUI,(dispatcher, context) -> new PuiEntityRenderer(dispatcher));
    }
}
