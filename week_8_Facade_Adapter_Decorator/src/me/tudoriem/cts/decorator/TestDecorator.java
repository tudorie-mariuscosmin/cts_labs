package me.tudoriem.cts.decorator;

import me.tudoriem.cts.adapter.ACMESuperHero;
import me.tudoriem.cts.adapter.FanstasyHero;

public class TestDecorator {

    public static void main(String[] args) {
        ACMESuperHero blueDragon = new FanstasyHero("Blue Dragon", 1000, true);
        blueDragon.move();
        blueDragon.takeAHit(500);
        //blueDragon.heal(250);

        blueDragon = new ShieldDecorator(blueDragon, 300);
        blueDragon.takeAHit(500);
        blueDragon = new WoundedDecorator(blueDragon);
        blueDragon.takeAHit(600);
        blueDragon.move();



    }
}

