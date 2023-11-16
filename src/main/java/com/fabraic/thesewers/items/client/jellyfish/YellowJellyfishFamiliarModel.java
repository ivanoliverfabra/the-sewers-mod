package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.GreenJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.YellowJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YellowJellyfishFamiliarModel extends AnimatedGeoModel<YellowJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(YellowJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(YellowJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/yellowjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(YellowJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}