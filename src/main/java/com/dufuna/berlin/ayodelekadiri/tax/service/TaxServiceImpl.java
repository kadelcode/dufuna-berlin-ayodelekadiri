package com.dufuna.berlin.ayodelekadiri.tax.service;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;
import com.dufuna.berlin.ayodelekadiri.tax.repository.TaxBracketRepository;
import org.springframework.data.domain.Sort;
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

        // Get brackets sorted by minIncome (important for correct calculation)
        List<TaxBracket> brackets = repository.findAll(Sort.by("minIncome"));

        double totalTax = 0.0;

        for (TaxBracket bracket : brackets) {

            double min = bracket.getMinIncome();
            double max = bracket.getMaxIncome();
            double rate = bracket.getRate();

            // Only apply if income exceeds this bracket's minimum
            if (income > min) {

                // Calculate portion of income within this bracket
                double taxableAmount = Math.min(income, max) - min;

                // Add tax for this bracket
                totalTax += taxableAmount * rate;
            }
        }

        return totalTax;
    }
}
