package me.tudoriem.cts.simpleFactory;

public class MachineGun extends  AbstractWeapon{
    int noBullets;

    public MachineGun(int power, int ammo){
        this.description = "Mg";
        this.powerLevel = power;
        this.noBullets = ammo;
    }

    @Override
    public void pewPew() {

    }
}
