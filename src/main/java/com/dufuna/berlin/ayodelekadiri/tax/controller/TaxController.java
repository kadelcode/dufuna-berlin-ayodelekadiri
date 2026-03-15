package com.dufuna.berlin.ayodelekadiri.tax.controller;

import com.dufuna.berlin.ayodelekadiri.tax.service.TaxService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tax")
public class TaxController {

    private final TaxService service;

    public TaxController(TaxService service) {
        this.service = service;
    }

    @GetMapping("/{income}")
    public double calculateTax(@PathVariable double income) {
        return service.calculateTax(income);
    }
}
