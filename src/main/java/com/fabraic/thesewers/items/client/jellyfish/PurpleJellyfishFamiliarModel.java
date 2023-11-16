package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.PurpleJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PurpleJellyfishFamiliarModel extends AnimatedGeoModel<PurpleJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(PurpleJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(PurpleJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/purplejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(PurpleJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}