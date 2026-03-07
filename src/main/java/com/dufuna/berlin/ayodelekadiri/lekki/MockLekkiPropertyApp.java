package com.dufuna.berlin.ayodelekadiri.lekki;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;
import com.dufuna.berlin.ayodelekadiri.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.ayodelekadiri.lekki.service.MockLekkiPropertyService;

import java.util.List;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiPropertyService service = new MockLekkiPropertyService();

        for (long i = 1; i <= 5; i++) {
            LekkiProperty property = new LekkiProperty();
            property.setPropertyId(i);
            property.setPropertyAddress("Lekki Phase " + i);
            property.setPropertyType("House");

            service.saveProperty(property);
        }

        // Get one property
        LekkiProperty retrievedProperty = service.getProperty(3L);
        System.out.println("Single Property:");
        System.out.println(retrievedProperty);

        // Get all properties
        System.out.println("\nAll Properties:");

        List<LekkiProperty> properties = service.getProperties();

        for (LekkiProperty property : properties) {
            System.out.println(property);
        }
    }
}
