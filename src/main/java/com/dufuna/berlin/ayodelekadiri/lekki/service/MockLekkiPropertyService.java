package com.dufuna.berlin.ayodelekadiri.lekki.service;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {
    private LekkiProperty storedProperty;

    @Override
    public void saveProperty(LekkiProperty property) {
        this.storedProperty = property;
        System.out.println("MockLekkiPropertyService.saveProperty called with: " + property);
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called, returning stored property.");
        return storedProperty;
    }
}
