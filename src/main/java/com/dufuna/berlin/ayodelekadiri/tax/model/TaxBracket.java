package com.dufuna.berlin.ayodelekadiri.tax.model;

public class TaxBracket {

    private double minIncome;
    private double maxIncome;
    private double rate;

    public TaxBracket(double minIncome, double maxIncome, double rate) {
        this.minIncome = minIncome;
        this.maxIncome = maxIncome;
        this.rate = rate;
    }

    public double getMinIncome() {
        return minIncome;
    }

    public double getMaxIncome() {
        return maxIncome;
    }

    public double getRate() {
        return rate;
    }
}
