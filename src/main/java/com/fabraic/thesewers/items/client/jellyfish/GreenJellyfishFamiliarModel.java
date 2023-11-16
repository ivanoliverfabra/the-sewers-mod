package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.GreenJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GreenJellyfishFamiliarModel extends AnimatedGeoModel<GreenJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(GreenJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(GreenJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/greenjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(GreenJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}