package com.dufuna.berlin.ayodelekadiri.lekki;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;
import com.dufuna.berlin.ayodelekadiri.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.ayodelekadiri.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId(1L);
        property.setPropertyAddress("Lekki Phase 1");
        property.setPropertyType("House");

        LekkiPropertyService service = new MockLekkiPropertyService();

        service.saveProperty(property);
        service.getProperty();
    }
}
