package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.LightGrayJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.YellowJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightGrayJellyfishFamiliarModel extends AnimatedGeoModel<LightGrayJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(LightGrayJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(LightGrayJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/lightgrayjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(LightGrayJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}