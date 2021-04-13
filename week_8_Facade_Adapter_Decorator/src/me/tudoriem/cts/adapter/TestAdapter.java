package me.tudoriem.cts.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        FanstasyHero blueDragon = new FanstasyHero("Blue Dragon", 1000, true);
        blueDragon.move();
        blueDragon.takeAHit(500);
        blueDragon.heal(250);
    }
}
