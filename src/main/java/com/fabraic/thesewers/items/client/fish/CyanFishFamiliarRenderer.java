package com.fabraic.thesewers.items.client.fish;

import com.fabraic.thesewers.items.familiars.CyanFishFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CyanFishFamiliarRenderer extends GeoItemRenderer<CyanFishFamiliar> {
    public CyanFishFamiliarRenderer() {
        super(new CyanFishFamiliarModel());
    }
}
