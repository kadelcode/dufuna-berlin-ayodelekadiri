package com.dufuna.berlin.ayodelekadiri.tax.service;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;
import com.dufuna.berlin.ayodelekadiri.tax.repository.TaxBracketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxServiceImpl implements TaxService {
    private final TaxBracketRepository repository;

    public TaxServiceImpl(TaxBracketRepository repository) {
        this.repository = repository;
    }

    @Override
    public double calculateTax(double income) {

        List<TaxBracket> brackets = repository.findAll();

        for (TaxBracket bracket : brackets) {
            if (income >= bracket.getMinIncome() && income <= bracket.getMaxIncome()) {
                return income * bracket.getRate();
            }
        }

        return 0;
    }
}
