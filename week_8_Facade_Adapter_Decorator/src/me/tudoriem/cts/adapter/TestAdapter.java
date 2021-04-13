package me.tudoriem.cts.adapter;

import me.tudoriem.cts.adapter.disney.DisneyActions;
import me.tudoriem.cts.adapter.disney.DonaldDuck;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        ACMESuperHero blueDragon = new FanstasyHero("Blue Dragon", 1000, true);
        blueDragon.move();
        blueDragon.takeAHit(500);
        blueDragon.heal(250);


        DisneyActions donald = new DonaldDuck(100);
        donald.changeLocation(122, 150);
        donald.isWounded(50);
        donald.restorePower(30);


        ArrayList<ACMESuperHero> heroes = new ArrayList<>();
        heroes.add(blueDragon);
        DisneyToAcmeAdapter donaldAdapter = new DisneyToAcmeAdapter(donald);
        heroes.add(donaldAdapter);
        for(ACMESuperHero hero:heroes){
            hero.move();
            hero.takeAHit(40);
            hero.heal(20);
        }
    }
}
