package me.tudoriem.cts.refactor.phase3.services;

public interface MarketingServiceInterface {
    public  static final int MAX_AGE_ACCOUNT = 10;
    public  static  final float MAX_FIFELITY_DISCOUNT = 0.15f;
    public float getFidelityDiscount(int accountAge);
}
