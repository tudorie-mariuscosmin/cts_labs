package me.tudoriem.cts.decorator;

import me.tudoriem.cts.adapter.ACMESuperHero;

public class WoundedDecorator extends AbstractDecorator{
    public WoundedDecorator(ACMESuperHero hero) {
        super(hero);
    }

    @Override
    public void move() {
        if(this.hero.lifePoints >500)
            this.hero.move();
        else
            System.out.println("The hero is barely moving");
    }
}
