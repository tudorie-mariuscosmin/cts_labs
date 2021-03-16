package me.tudoriem.cts.refactor.phase3.services;

public class MarketingEasterStrategy implements  MarketingServiceInterface{

    @Override
    public float getFidelityDiscount(int accountAge) {
       return 0.5f;
    }
}
