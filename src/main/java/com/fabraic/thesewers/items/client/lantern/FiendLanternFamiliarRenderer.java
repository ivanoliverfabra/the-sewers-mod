package com.fabraic.thesewers.items.client.lantern;

import com.fabraic.thesewers.items.familiars.FiendLanternFamiliar;
import com.fabraic.thesewers.items.familiars.LitLanternFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class FiendLanternFamiliarRenderer extends GeoItemRenderer<FiendLanternFamiliar> {
    public FiendLanternFamiliarRenderer() {
        super(new FiendLanternFamiliarModel());
    }
}