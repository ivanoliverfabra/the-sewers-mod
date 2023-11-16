package com.fabraic.thesewers.items.client.lantern;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.LitLanternFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LitLanternFamiliarModel extends AnimatedGeoModel<LitLanternFamiliar> {
    @Override
    public Identifier getModelResource(LitLanternFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/lanternfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(LitLanternFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/litlanternfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(LitLanternFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/lanternfamiliaritem.animation.json");
    }
}

