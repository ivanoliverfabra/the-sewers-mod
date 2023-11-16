package com.fabraic.thesewers.items.client.mimic;

import com.fabraic.thesewers.items.familiars.IceMimicFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class IceMimicFamiliarRenderer extends GeoItemRenderer<IceMimicFamiliar> {
    public IceMimicFamiliarRenderer() {
        super(new IceMimicFamiliarModel());
    }
}
