package com.fabraic.thesewers.items.client.mimic;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.DarkMimicFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DarkMimicFamiliarModel extends AnimatedGeoModel<DarkMimicFamiliar> {

    @Override
    public Identifier getModelResource(DarkMimicFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/mimicfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(DarkMimicFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/darkmimicfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(DarkMimicFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/mimicfamiliaritem.animation.json");
    }
}