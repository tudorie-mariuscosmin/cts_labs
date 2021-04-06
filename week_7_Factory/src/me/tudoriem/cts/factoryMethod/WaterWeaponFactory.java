package me.tudoriem.cts.factoryMethod;

import me.tudoriem.cts.simpleFactory.AbstractWeapon;
import me.tudoriem.cts.simpleFactory.WeaponType;

public class WaterWeaponFactory extends  AbstractFactory{
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String desc) {
        AbstractWeapon weapon = null;
        switch (type){
            case PISTOL:
                weapon = new WaterPistol();
                break;
            case MACHINE_GUN:
                weapon = new WaterBalloon();
                break;
            case BAZOOKA:
                weapon = new WaterBucket();
        }
        return weapon;
    }
}
