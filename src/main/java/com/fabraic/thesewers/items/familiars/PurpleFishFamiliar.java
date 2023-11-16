package com.fabraic.thesewers.items.familiars;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRenderer;
import com.fabraic.thesewers.TheSewers;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.manager.InstancedAnimationFactory;

import java.util.List;

public class PurpleFishFamiliar extends TrinketItem implements IAnimatable, TrinketRenderer {
    public AnimationFactory factory = new InstancedAnimationFactory(this);

    public PurpleFishFamiliar(Settings settings) {
        super(settings);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().loop("idle"));

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));

    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    };

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {

        if (entity.isInSwimmingPose()) {
            Vec3d vel = entity.getVelocity();
            entity.setVelocity(vel.x * 1.065, vel.y * 1.065, vel.z * 1.065);
            entity.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
        } else if (entity.isTouchingWater()) {
            Vec3d vel = entity.getVelocity();
            entity.setVelocity(vel.x * 1.12, vel.y * 1.12, vel.z * 1.12);
            entity.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
        }



        super.tick(stack, slot, entity);
    }

    @Override
    public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        TheSewers.headFamiliarTrinket(matrices,contextModel,entity,headYaw,headPitch);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.thesewers.fishfamtp").formatted(Formatting.RED));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
