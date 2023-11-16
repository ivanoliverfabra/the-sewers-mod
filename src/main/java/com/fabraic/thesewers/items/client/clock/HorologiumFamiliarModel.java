package com.fabraic.thesewers.items.client.clock;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.HorologiumFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HorologiumFamiliarModel extends AnimatedGeoModel<HorologiumFamiliar> {
    @Override
    public Identifier getModelResource(HorologiumFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/clockfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(HorologiumFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/horologiumfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(HorologiumFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/clockfamiliaritem.animation.json");
    }
}
