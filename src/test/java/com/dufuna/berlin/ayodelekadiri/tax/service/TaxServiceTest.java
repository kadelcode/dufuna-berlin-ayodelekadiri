package com.dufuna.berlin.ayodelekadiri.tax.service;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;
import com.dufuna.berlin.ayodelekadiri.tax.repository.TaxBracketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxServiceTest {

    private TaxService taxService;

    @BeforeEach
    void setUp() {

        TaxBracketRepository repository = new TaxBracketRepository() {
            @Override
            public List<TaxBracket> findAll() {
                return List.of(
                        new TaxBracket(0, 10000, 0.1),
                        new TaxBracket(10001, 50000, 0.2),
                        new TaxBracket(50001, 100000, 0.3)
                );
            }
        };

        taxService = new TaxServiceImpl(repository);
    }

    @Test
    void testLowIncomeTax() {
        double tax = taxService.calculateTax(5000);
        assertEquals(500, tax);
    }

    @Test
    void testMediumIncomeTax() {
        double tax = taxService.calculateTax(30000);
        assertEquals(6000, tax);
    }

    @Test
    void testHighIncomeTax() {
        double tax = taxService.calculateTax(80000);
        assertEquals(24000, tax);
    }
}
