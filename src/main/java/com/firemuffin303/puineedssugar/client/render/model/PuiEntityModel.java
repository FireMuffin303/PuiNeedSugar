package com.firemuffin303.puineedssugar.client.render.model;

import com.firemuffin303.puineedssugar.entity.PuiEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.PathAwareEntity;

public class PuiEntityModel<P extends PathAwareEntity> extends EntityModel<PuiEntity> {
    private final ModelPart feet;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart body;
    private final ModelPart ears;
    private final ModelPart arms;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    public PuiEntityModel() {
        textureWidth = 64;
        textureHeight = 64;
        feet = new ModelPart(this);
        feet.setPivot(0.0F, 24.0F, 0.0F);


        cube_r1 = new ModelPart(this);
        cube_r1.setPivot(0.0F, 0.0F, 3.0F);
        feet.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -2.7925F, 0.0F);
        cube_r1.setTextureOffset(0, 23).addCuboid(0.0F, -1.0F, 0.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);

        cube_r2 = new ModelPart(this);
        cube_r2.setPivot(0.0F, 0.0F, 3.0F);
        feet.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 2.7925F, 0.0F);
        cube_r2.setTextureOffset(24, 23).addCuboid(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);

        body = new ModelPart(this);
        body.setPivot(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addCuboid(-4.0F, -9.0F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        ears = new ModelPart(this);
        ears.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(ears);
        ears.setTextureOffset(38, 11).addCuboid(-3.0F, -13.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
        ears.setTextureOffset(32, 11).addCuboid(1.0F, -13.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

        arms = new ModelPart(this);
        arms.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(arms);


        cube_r3 = new ModelPart(this);
        cube_r3.setPivot(4.0F, -7.0F, 1.0F);
        arms.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
        cube_r3.setTextureOffset(34, 6).addCuboid(0.0F, 4.0F, -1.0F, 2.0F, -4.0F, 2.0F, 0.0F, false);

        cube_r4 = new ModelPart(this);
        cube_r4.setPivot(-4.0F, -7.0F, 1.0F);
        arms.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2618F);
        cube_r4.setTextureOffset(34, 6).addCuboid(-2.0F, 4.0F, -1.0F, 2.0F, -4.0F, 2.0F, 0.0F, false);
    }
    @Override
    public void setAngles(PuiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        feet.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }


}
