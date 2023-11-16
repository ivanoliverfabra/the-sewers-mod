package com.fabraic.thesewers;

import com.fabraic.thesewers.items.SewersBlock;
import com.fabraic.thesewers.items.SewersItem;
import com.fabraic.thesewers.items.client.clock.ClockFamiliarRenderer;
import com.fabraic.thesewers.items.client.clock.HorologiumFamiliarRenderer;
import com.fabraic.thesewers.items.client.eye.ConduitEyeFamiliarRenderer;
import com.fabraic.thesewers.items.client.eye.SuspiciousEyeFamiliarRenderer;
import com.fabraic.thesewers.items.client.fish.CyanFishFamiliarRenderer;
import com.fabraic.thesewers.items.client.fish.PurpleFishFamiliarRenderer;
import com.fabraic.thesewers.items.client.fish.RedFishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.BlackJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.BlueJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.BrownJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.CyanJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.GrayJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.GreenJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.LightBlueJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.LightGrayJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.MagentaJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.OrangeJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.PinkJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.PurpleJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.RedJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.WhiteJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.jellyfish.YellowJellyfishFamiliarRenderer;
import com.fabraic.thesewers.items.client.lantern.FiendLanternFamiliarRenderer;
import com.fabraic.thesewers.items.client.lantern.LitLanternFamiliarRenderer;
import com.fabraic.thesewers.items.client.mimic.DarkMimicFamiliarRenderer;
import com.fabraic.thesewers.items.client.mimic.IceMimicFamiliarRenderer;
import com.fabraic.thesewers.items.client.mimic.MimicFamiliarRenderer;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Quaternion;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class TheSewersClient implements ClientModInitializer {
  @SuppressWarnings("unchecked")
  @Override
  public void onInitializeClient() {
    
    // FAMILIARS
    GeoItemRenderer.registerItemRenderer(SewersItem.SUSPICIOUS_EYE_FAMILIAR, new SuspiciousEyeFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.CONDUIT_EYE_FAMILIAR, new ConduitEyeFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.MIMIC_FAMILIAR, new MimicFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.DARK_MIMIC_FAMILIAR, new DarkMimicFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.ICE_MIMIC_FAMILIAR, new IceMimicFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.BLUE_JELLYFISH_FAMILIAR, new BlueJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.GREEN_JELLYFISH_FAMILIAR, new GreenJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.YELLOW_JELLYFISH_FAMILIAR, new YellowJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.RED_JELLYFISH_FAMILIAR, new RedJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.ORANGE_JELLYFISH_FAMILIAR, new OrangeJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.PINK_JELLYFISH_FAMILIAR, new PinkJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.PURPLE_JELLYFISH_FAMILIAR, new PurpleJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.MAGENTA_JELLYFISH_FAMILIAR, new MagentaJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.LIGHTGRAY_JELLYFISH_FAMILIAR, new LightGrayJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.LIGHTBLUE_JELLYFISH_FAMILIAR, new LightBlueJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.CYAN_JELLYFISH_FAMILIAR, new CyanJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.GRAY_JELLYFISH_FAMILIAR, new GrayJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.WHITE_JELLYFISH_FAMILIAR, new WhiteJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.BLACK_JELLYFISH_FAMILIAR, new BlackJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.BROWN_JELLYFISH_FAMILIAR, new BrownJellyfishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.LIT_LANTERN, new LitLanternFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.FIEND_LANTERN, new FiendLanternFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.RED_FISH_FAMILIAR, new RedFishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.CYAN_FISH_FAMILIAR, new CyanFishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.PURPLE_FISH_FAMILIAR, new PurpleFishFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.CLOCK_FAMILIAR, new ClockFamiliarRenderer());
    GeoItemRenderer.registerItemRenderer(SewersItem.HOROLOGIUM_FAMILIAR, new HorologiumFamiliarRenderer());
    
    BlockRenderLayerMap.INSTANCE.putBlock(SewersBlock.SNOW_GLOBE, RenderLayer.getTranslucent());

    TrinketRendererRegistry.registerRenderer(SewersItem.CONDUIT_EYE_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.5F, 0.5F, 0.5F);
        matrices.translate(1.0F, -0.85F, 0.0F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.SUSPICIOUS_EYE_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.5F, 0.5F, 0.5F);
        matrices.translate(1.0F, -0.85F, 0.0F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.MIMIC_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.0F, -0.4F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.DARK_MIMIC_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.0F, -0.4F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.ICE_MIMIC_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.0F, -0.4F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.BLUE_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.GREEN_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.YELLOW_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.RED_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.ORANGE_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.PINK_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.PURPLE_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.MAGENTA_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.LIGHTGRAY_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.LIGHTBLUE_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.CYAN_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.GRAY_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.WHITE_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.BLACK_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.BROWN_JELLYFISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.LIT_LANTERN,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.FIEND_LANTERN,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.65F, 0.65F, 0.65F);
        matrices.translate(0.85F, 0.2F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.RED_FISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.75F, 0.75F, 0.75F);
        matrices.translate(0.85F, 0.15F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.CYAN_FISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.75F, 0.75F, 0.75F);
        matrices.translate(0.85F, 0.15F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.PURPLE_FISH_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.75F, 0.75F, 0.75F);
        matrices.translate(0.85F, 0.15F, 0.5F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.CLOCK_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.75F, 0.75F, 0.75F);
        matrices.translate(0.7F, -0.25F, 0.6F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    TrinketRendererRegistry.registerRenderer(SewersItem.HOROLOGIUM_FAMILIAR,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices,
        (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(0.75F, 0.75F, 0.75F);
        matrices.translate(0.7F, -0.25F, 0.6F);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
    
    // HATS
    TrinketRendererRegistry.registerRenderer(SewersItem.SANTA_HAT,
    (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
      if (entity instanceof AbstractClientPlayerEntity player) {
        TrinketRenderer.translateToFace(matrices, (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
        matrices.scale(1.4F, 1.2F, 1.4F);
        matrices.multiply(Direction.DOWN.getRotationQuaternion());
        matrices.multiply(new Quaternion(0, 180, 0, true));
        matrices.translate(0.0, 0.61, 0.2);
        MinecraftClient.getInstance().getItemRenderer()
        .renderItem(stack, Mode.NONE, light, OverlayTexture.DEFAULT_UV, matrices,
        vertexConsumers, 0);
      }
    });
  }
}
