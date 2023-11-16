package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.BlueJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueJellyfishFamiliarModel extends AnimatedGeoModel<BlueJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(BlueJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlueJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/bluejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(BlueJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}