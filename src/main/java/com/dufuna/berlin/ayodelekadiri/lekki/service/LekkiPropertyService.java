package com.dufuna.berlin.ayodelekadiri.lekki.service;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {

  LekkiProperty saveProperty(LekkiProperty property);

  LekkiProperty getProperty(Long id);

  List<LekkiProperty> getProperties();
}
