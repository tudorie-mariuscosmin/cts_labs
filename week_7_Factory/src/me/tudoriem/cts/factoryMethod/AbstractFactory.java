package me.tudoriem.cts.factoryMethod;

import me.tudoriem.cts.simpleFactory.AbstractWeapon;
import me.tudoriem.cts.simpleFactory.WeaponType;

public abstract class AbstractFactory {
    public abstract AbstractWeapon getWeapon(WeaponType type, String desc);
}
