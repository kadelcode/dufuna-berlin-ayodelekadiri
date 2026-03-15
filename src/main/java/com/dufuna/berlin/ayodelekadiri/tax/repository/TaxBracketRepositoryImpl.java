package com.dufuna.berlin.ayodelekadiri.tax.repository;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaxBracketRepositoryImpl implements TaxBracketRepository{

    private final List<TaxBracket> brackets = new ArrayList<>();

    public TaxBracketRepositoryImpl() {

        brackets.add(new TaxBracket(0, 10000, 0.1));
        brackets.add(new TaxBracket(10000, 50000, 0.2));
        brackets.add(new TaxBracket(50000, Double.MAX_VALUE, 0.3));

    }

    @Override
    public List<TaxBracket> findAll() {
        return brackets;
    }
}
