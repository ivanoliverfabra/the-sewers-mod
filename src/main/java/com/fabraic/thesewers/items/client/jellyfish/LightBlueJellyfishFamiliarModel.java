package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.LightBlueJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.LightGrayJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightBlueJellyfishFamiliarModel extends AnimatedGeoModel<LightBlueJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(LightBlueJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(LightBlueJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/lightbluejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(LightBlueJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}