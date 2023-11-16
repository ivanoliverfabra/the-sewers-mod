package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.BlueJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.MagentaJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagentaJellyfishFamiliarModel extends AnimatedGeoModel<MagentaJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(MagentaJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(MagentaJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/magentajellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(MagentaJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}