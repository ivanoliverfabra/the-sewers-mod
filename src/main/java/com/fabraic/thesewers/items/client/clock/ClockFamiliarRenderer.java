package com.fabraic.thesewers.items.client.clock;

import com.fabraic.thesewers.items.familiars.ClockFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ClockFamiliarRenderer extends GeoItemRenderer<ClockFamiliar> {
    public ClockFamiliarRenderer() {
        super(new ClockFamiliarModel());
    }
}
