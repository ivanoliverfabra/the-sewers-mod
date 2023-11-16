package com.fabraic.thesewers.items.client.fish;

import com.fabraic.thesewers.items.familiars.PurpleFishFamiliar;
import com.fabraic.thesewers.items.familiars.RedFishFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PurpleFishFamiliarRenderer extends GeoItemRenderer<PurpleFishFamiliar> {
    public PurpleFishFamiliarRenderer() {
        super(new PurpleFishFamiliarModel());
    }
}
