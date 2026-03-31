package com.dufuna.berlin.ayodelekadiri.tax.service;

import com.dufuna.berlin.ayodelekadiri.tax.model.TaxBracket;
import com.dufuna.berlin.ayodelekadiri.tax.repository.TaxBracketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class TaxServiceTest {

    private TaxService taxService;
    private TaxBracketRepository repository;

    @BeforeEach
    void setUp() {

        // Mock repository
        repository = Mockito.mock(TaxBracketRepository.class);

        // Mock the correct method
        when(repository.findAll(any(Sort.class))).thenReturn(List.of(
                new TaxBracket(0, 10000, 0.1),
                new TaxBracket(10000, 50000, 0.2),
                new TaxBracket(50000, Double.MAX_VALUE, 0.3)
        ));

        // Inject mock into service
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
        assertEquals(5000, tax);
    }

    @Test
    void testHighIncomeTax() {
        double tax = taxService.calculateTax(80000);
        assertEquals(18000, tax);
    }
}
