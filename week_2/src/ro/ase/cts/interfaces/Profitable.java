package ro.ase.cts.interfaces;

public interface Profitable {
    public  static  final double MAX_INTEREST_PERCENT = 5;
    public abstract void addInterest(double interestPercent);
}
