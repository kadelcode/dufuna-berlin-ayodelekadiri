package com.dufuna.berlin.ayodelekadiri.lekki.service;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;
import com.dufuna.berlin.ayodelekadiri.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.ayodelekadiri.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {
    private final SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return repository.save(property);
    }

    @Override
    public LekkiProperty getProperty(Long id) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return repository.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return repository.findAll();
    }
}
