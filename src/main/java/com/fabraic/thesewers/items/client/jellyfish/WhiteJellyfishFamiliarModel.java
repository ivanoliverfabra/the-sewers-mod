package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.GrayJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.WhiteJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WhiteJellyfishFamiliarModel extends AnimatedGeoModel<WhiteJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(WhiteJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(WhiteJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/whitejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(WhiteJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}