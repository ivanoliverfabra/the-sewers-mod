package com.fabraic.thesewers.items.client.clock;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.ClockFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClockFamiliarModel extends AnimatedGeoModel<ClockFamiliar> {
    @Override
    public Identifier getModelResource(ClockFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/clockfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(ClockFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/clockfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(ClockFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/clockfamiliaritem.animation.json");
    }
}
