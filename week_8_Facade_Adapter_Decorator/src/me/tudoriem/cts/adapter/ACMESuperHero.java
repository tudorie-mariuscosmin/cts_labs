package me.tudoriem.cts.adapter;

public abstract class ACMESuperHero {
    String name;
    int lifePoints;


    public ACMESuperHero(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public abstract void move();
    public abstract void crouch();
    public abstract void takeAHit(int points);
    public abstract void heal(int points);
}
