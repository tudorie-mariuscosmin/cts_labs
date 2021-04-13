package me.tudoriem.cts.adapter;

import me.tudoriem.cts.adapter.disney.DisneyActions;

public class DisneyToAcmeAdapter extends ACMESuperHero {
    DisneyActions disneyHero = null;

    public DisneyToAcmeAdapter(DisneyActions disneyHero) {
        super(disneyHero.getName(), disneyHero.getPower());
        this.disneyHero = disneyHero;
    }


    @Override
    public void move() {
        this.disneyHero.changeLocation(0,0);
    }

    @Override
    public void crouch() {
        System.out.printf("%s is moving slowly\n", this.disneyHero.getName());
    }

    @Override
    public void takeAHit(int points) {
        this.disneyHero.isWounded(points);
    }

    @Override
    public void heal(int points) {
        this.disneyHero.restorePower(points);
    }

}
