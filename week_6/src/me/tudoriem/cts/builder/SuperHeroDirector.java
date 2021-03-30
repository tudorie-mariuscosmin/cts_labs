package me.tudoriem.cts.builder;

public class SuperHeroDirector {
    SuperHero.SuperHeroBuilder builder;

    public  SuperHeroDirector(SuperHero.SuperHeroBuilder builder){
        this.builder = builder;
    }

    public  SuperHero buildJoker(){
        return builder
                .addRightWeapon(new Pistol())
                .addLeftWeapon(new Pistol())
                .build();
    }
    public SuperHero buildSuperman(){
        return builder.addSuperPower("fly")
                .addLeftWeapon(new Pistol())
                .build();
    }
}
