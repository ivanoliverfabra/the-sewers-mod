package com.fabraic.thesewers.items.client.mimic;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.MimicFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MimicFamiliarModel extends AnimatedGeoModel<MimicFamiliar> {

    @Override
    public Identifier getModelResource(MimicFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/mimicfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(MimicFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/mimicfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(MimicFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/mimicfamiliaritem.animation.json");
    }
}