package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.BrownJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BrownJellyfishFamiliarModel extends AnimatedGeoModel<BrownJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(BrownJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(BrownJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/brownjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(BrownJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}