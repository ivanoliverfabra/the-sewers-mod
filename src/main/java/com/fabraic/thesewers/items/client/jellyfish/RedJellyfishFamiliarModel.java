package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.BlueJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedJellyfishFamiliarModel extends AnimatedGeoModel<RedJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(RedJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(RedJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/redjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(RedJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}