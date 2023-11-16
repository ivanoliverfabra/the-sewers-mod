package com.fabraic.thesewers.items.client.lantern;

import com.fabraic.thesewers.items.client.eye.ConduitEyeFamiliarModel;
import com.fabraic.thesewers.items.familiars.ConduitEyeFamiliar;
import com.fabraic.thesewers.items.familiars.LitLanternFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LitLanternFamiliarRenderer extends GeoItemRenderer<LitLanternFamiliar> {
    public LitLanternFamiliarRenderer() {
        super(new LitLanternFamiliarModel());
    }
}