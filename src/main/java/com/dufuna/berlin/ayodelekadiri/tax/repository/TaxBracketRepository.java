package com.dufuna.berlin.ayodelekadiri.tax.repository;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxBracketRepository extends JpaRepository<TaxBracket, Long> {
}
