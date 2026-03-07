package com.dufuna.berlin.ayodelekadiri.lekki.repository;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);

    LekkiProperty findById(Long id);

    List<LekkiProperty> findAll();

    LekkiProperty update(LekkiProperty property);
}
