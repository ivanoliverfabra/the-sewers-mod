package com.fabraic.thesewers.items.client.lantern;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.FiendLanternFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FiendLanternFamiliarModel extends AnimatedGeoModel<FiendLanternFamiliar> {
    @Override
    public Identifier getModelResource(FiendLanternFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/lanternfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(FiendLanternFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/fiendlanternfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(FiendLanternFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/lanternfamiliaritem.animation.json");
    }
}

