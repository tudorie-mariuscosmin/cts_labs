package me.tudoriem.cts.simpleFactory;

public class Pistol extends  AbstractWeapon{
    public Pistol (String description, int powerLevel){
        this.description = description;
        this.powerLevel = powerLevel;
    }

    @Override
    public void pewPew() {

    }
}
