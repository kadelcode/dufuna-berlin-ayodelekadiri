package com.dufuna.berlin.ayodelekadiri.lekki.service;

import com.dufuna.berlin.ayodelekadiri.lekki.model.LekkiProperty;

public interface LekkiPropertyService {
  void saveProperty(LekkiProperty property);

  LekkiProperty getProperty();
}
