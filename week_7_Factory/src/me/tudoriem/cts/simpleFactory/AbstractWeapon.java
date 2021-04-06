package me.tudoriem.cts.simpleFactory;

public abstract class AbstractWeapon {
    protected String description;
    protected int powerLevel;

    public abstract void pewPew();

    public void setDescription(String description) {
        this.description = description;
    }
}
