package com.dufuna.berlin.ayodelekadiri.tax.model;

import jakarta.persistence.*;

@Entity
public class TaxBracket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double minIncome;
    private double maxIncome;
    private double rate;

    public TaxBracket() {}

    public TaxBracket(double minIncome, double maxIncome, double rate) {
        this.minIncome = minIncome;
        this.maxIncome = maxIncome;
        this.rate = rate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public double getMinIncome() {
        return minIncome;
    }

    public void setMinIncome(double minIncome) {
        this.minIncome = minIncome;
    }

    public double getMaxIncome() {
        return maxIncome;
    }

    public void setMaxIncome(double maxIncome) {
        this.maxIncome = maxIncome;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
