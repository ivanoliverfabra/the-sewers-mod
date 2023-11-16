package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.OrangeJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeJellyfishFamiliarModel extends AnimatedGeoModel<OrangeJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(OrangeJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(OrangeJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/orangejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(OrangeJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}