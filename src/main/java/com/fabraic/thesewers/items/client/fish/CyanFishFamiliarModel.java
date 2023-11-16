package com.fabraic.thesewers.items.client.fish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.CyanFishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CyanFishFamiliarModel extends AnimatedGeoModel<CyanFishFamiliar> {
    @Override
    public Identifier getModelResource(CyanFishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/fishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(CyanFishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/cyanfishfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(CyanFishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/fishfamiliaritem.animation.json");
    }
}