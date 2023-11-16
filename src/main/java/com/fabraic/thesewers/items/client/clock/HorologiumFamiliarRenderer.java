package com.fabraic.thesewers.items.client.clock;

import com.fabraic.thesewers.items.familiars.HorologiumFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HorologiumFamiliarRenderer extends GeoItemRenderer<HorologiumFamiliar> {
    public HorologiumFamiliarRenderer() {
        super(new HorologiumFamiliarModel());
    }
}
