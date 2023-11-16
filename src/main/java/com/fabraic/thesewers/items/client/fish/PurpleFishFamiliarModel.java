package com.fabraic.thesewers.items.client.fish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.PurpleFishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PurpleFishFamiliarModel extends AnimatedGeoModel<PurpleFishFamiliar> {
    @Override
    public Identifier getModelResource(PurpleFishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/fishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(PurpleFishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/purplefishfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(PurpleFishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/fishfamiliaritem.animation.json");
    }
}