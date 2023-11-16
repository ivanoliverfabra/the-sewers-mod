package com.fabraic.thesewers.items.client.eye;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.ConduitEyeFamiliar;
import com.fabraic.thesewers.items.familiars.SuspiciousEyeFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConduitEyeFamiliarModel extends AnimatedGeoModel<ConduitEyeFamiliar> {
    @Override
    public Identifier getModelResource(ConduitEyeFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/eyefamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(ConduitEyeFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/conduiteyefamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(ConduitEyeFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/eyefamiliaritem.animation.json");
    }
}
