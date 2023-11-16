package com.fabraic.thesewers.items.client.fish;

import com.fabraic.thesewers.items.client.eye.ConduitEyeFamiliarModel;
import com.fabraic.thesewers.items.familiars.ConduitEyeFamiliar;
import com.fabraic.thesewers.items.familiars.RedFishFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class RedFishFamiliarRenderer extends GeoItemRenderer<RedFishFamiliar> {
    public RedFishFamiliarRenderer() {
        super(new RedFishFamiliarModel());
    }
}
