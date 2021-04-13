package me.tudoriem.cts.adapter;

public class FanstasyHero extends ACMESuperHero{

    boolean canFly = false;

    public FanstasyHero(String name, int lifePoints, boolean canFly) {
        super(name, lifePoints);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if(canFly){
            System.out.println("Is flying");
        }else{
            System.out.println("Is running");
        }
    }

    @Override
    public void crouch() {
        System.out.println("Is crouching");
    }

    @Override
    public void takeAHit(int points) {
        System.out.printf("%s takes a hit of %d points", name, points);
        this.lifePoints -= points;
    }

    @Override
    public void heal(int points) {
        System.out.printf("%s heales %d points", name, points);
        this.lifePoints +=points;
    }
}
