package com.fabraic.thesewers.items.client.eye;

import com.fabraic.thesewers.items.familiars.SuspiciousEyeFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class SuspiciousEyeFamiliarRenderer extends GeoItemRenderer<SuspiciousEyeFamiliar> {
    public SuspiciousEyeFamiliarRenderer() {
        super(new SuspiciousEyeFamiliarModel());
    }
}
