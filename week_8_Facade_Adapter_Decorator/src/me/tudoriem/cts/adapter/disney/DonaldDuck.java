package me.tudoriem.cts.adapter.disney;

public class DonaldDuck implements DisneyActions {
    public final String name = "Donald Duck";
    int powerLevel;

    public DonaldDuck(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public void changeLocation(int x, int y) {
        System.out.println("Moved to a new location");
    }

    @Override
    public void isWounded(int power) {
        powerLevel -= power;
        System.out.println("Power level decreased to " + powerLevel);
    }

    @Override
    public void restorePower(int power) {
        powerLevel += power;
        System.out.println("Power level increased to " + powerLevel);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPower() {
        return this.powerLevel;
    }
}
