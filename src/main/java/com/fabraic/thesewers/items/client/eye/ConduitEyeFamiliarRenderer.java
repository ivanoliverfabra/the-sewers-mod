package com.fabraic.thesewers.items.client.eye;

import com.fabraic.thesewers.items.familiars.ConduitEyeFamiliar;
import com.fabraic.thesewers.items.familiars.SuspiciousEyeFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ConduitEyeFamiliarRenderer extends GeoItemRenderer<ConduitEyeFamiliar> {
    public ConduitEyeFamiliarRenderer() {
        super(new ConduitEyeFamiliarModel());
    }
}
