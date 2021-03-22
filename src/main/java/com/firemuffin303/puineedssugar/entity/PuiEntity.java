package com.firemuffin303.puineedssugar.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class PuiEntity extends PathAwareEntity implements Angerable {
    //private static final TrackedData<Integer> ANGER;
    //private static final IntRange ANGER_TIME_RANGE;
    private UUID targetUUID;

    public PuiEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void intGoals(){
        this.goalSelector.add(1,new SwimGoal(this));
        this.goalSelector.add(5, new MeleeAttackGoal(this, 1.0D, true));
        //this.targetSelector.add(4, new FollowTargetGoal(this, PlayerEntity.class, 10, true, false, this::shouldAngerAt));
        this.goalSelector.add(8, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(10, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(10, new LookAroundGoal(this));

    }



    @Override
    public int getAngerTime() { return 0;
        //return (Integer)this.dataTracker.get(ANGER);
    }

    @Override
    public void setAngerTime(int ticks) {
       // this.dataTracker.set(ANGER, ticks);
    }

    @Override
    public @Nullable UUID getAngryAt() {
        return this.targetUUID;
    }

    @Override
    public void setAngryAt(@Nullable UUID uuid) {

    }

    @Override
    public void chooseRandomAngerTime() {

    }
}
