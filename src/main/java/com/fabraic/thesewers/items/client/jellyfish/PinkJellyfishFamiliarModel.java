package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.PinkJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PinkJellyfishFamiliarModel extends AnimatedGeoModel<PinkJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(PinkJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(PinkJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/pinkjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(PinkJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}