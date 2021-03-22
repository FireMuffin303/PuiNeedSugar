package com.firemuffin303.puineedssugar.client.render;

import com.firemuffin303.puineedssugar.PuiNeedsSugar;
import com.firemuffin303.puineedssugar.client.render.model.PuiEntityModel;
import com.firemuffin303.puineedssugar.entity.PuiEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PuiEntityRenderer extends MobEntityRenderer<PuiEntity, PuiEntityModel<PuiEntity>> {
    private static final Identifier TEXTURE = new Identifier(PuiNeedsSugar.MODID,"textures/entity/pui/pui.png");

    public PuiEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher,new PuiEntityModel(),0.5f);
    }

    @Override
    public Identifier getTexture(PuiEntity entity) {
        return TEXTURE;
    }
}
