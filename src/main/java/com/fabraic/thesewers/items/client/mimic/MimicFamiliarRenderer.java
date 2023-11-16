package com.fabraic.thesewers.items.client.mimic;

import com.fabraic.thesewers.items.familiars.MimicFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MimicFamiliarRenderer extends GeoItemRenderer<MimicFamiliar> {
    public MimicFamiliarRenderer() {
        super(new MimicFamiliarModel());
    }
}
