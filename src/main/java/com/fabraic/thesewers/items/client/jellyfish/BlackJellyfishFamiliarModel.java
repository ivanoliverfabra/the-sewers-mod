package com.fabraic.thesewers.items.client.jellyfish;

import com.fabraic.thesewers.TheSewers;
import com.fabraic.thesewers.items.familiars.BlackJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackJellyfishFamiliarModel extends AnimatedGeoModel<BlackJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(BlackJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlackJellyfishFamiliar object) {
        return new Identifier(TheSewers.MOD_ID, "textures/item/blackjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(BlackJellyfishFamiliar animatable) {
        return new Identifier(TheSewers.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}