package com.fabraic.thesewers.items.client.mimic;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.IceMimicFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceMimicFamiliarModel extends AnimatedGeoModel<IceMimicFamiliar> {

    @Override
    public Identifier getModelResource(IceMimicFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/mimicfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(IceMimicFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/icemimicfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(IceMimicFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/mimicfamiliaritem.animation.json");
    }
}