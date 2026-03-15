package com.dufuna.berlin.ayodelekadiri.tax.repository;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;

import java.util.List;

public interface TaxBracketRepository {

    List<TaxBracket> findAll();
}
