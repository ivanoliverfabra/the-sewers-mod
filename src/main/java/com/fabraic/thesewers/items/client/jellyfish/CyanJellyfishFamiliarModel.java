package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.CyanJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CyanJellyfishFamiliarModel extends AnimatedGeoModel<CyanJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(CyanJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(CyanJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/cyanjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(CyanJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}