package com.dufuna.berlin.ayodelekadiri.lekki.repository;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;

import java.util.*;

public class SimpleLekkiPropertyRepositoryImpl
        implements SimpleLekkiPropertyRepository {
    private final Map<Long, LekkiProperty> database = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty property) {
        database.put(property.getPropertyId(), property);
        return property;
    }

    @Override
    public LekkiProperty findById(Long id) {
        return database.get(id);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public LekkiProperty update(LekkiProperty property) {
        database.put(property.getPropertyId(), property);
        return property;
    }

}
