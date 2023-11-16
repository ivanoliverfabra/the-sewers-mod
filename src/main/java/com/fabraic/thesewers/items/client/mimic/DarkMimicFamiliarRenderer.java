package com.fabraic.thesewers.items.client.mimic;

import com.fabraic.thesewers.items.familiars.DarkMimicFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class DarkMimicFamiliarRenderer extends GeoItemRenderer<DarkMimicFamiliar> {
    public DarkMimicFamiliarRenderer() {
        super(new DarkMimicFamiliarModel());
    }
}
