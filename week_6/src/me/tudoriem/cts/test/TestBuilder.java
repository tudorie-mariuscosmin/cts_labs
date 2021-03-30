package me.tudoriem.cts.test;

import me.tudoriem.cts.builder.Pistol;
import me.tudoriem.cts.builder.SuperHero;

public class TestBuilder {
    public static void main(String[] args) {

//        //1.Create the object
//        SuperHero superHero = new SuperHero();
//        //2.Init the object
//        //TODO: don;t forget
//        superHero.name = "Superman";
//        superHero.lifePoints = 100;
//
//        superHero.superPower = "can fly";

        //SuperHero superHero = new SuperHero("Superman", 100, false, false, null, new Pistol(), "LaserEyes", "");

        SuperHero superman = new SuperHero.SuperHeroBuilder("SuperMan", 100)
                .addSuperPower("fly")
                .addLeftWeapon(new Pistol())
                .build();

        SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
                .isVillan()
                .addLeftWeapon(new Pistol())
                .addRightWeapon(new Pistol())
                .build();
    }
}
