package me.tudoriem.cts.refactor.phase3.services;

public class Marketing2021Strategy implements  MarketingServiceInterface{

    @Override
    public float getFidelityDiscount(int accountAge) {
        return (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIFELITY_DISCOUNT : (float)accountAge/100;
    }
}
