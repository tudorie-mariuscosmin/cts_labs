package me.tudoriem.cts.factoryMethod;

import me.tudoriem.cts.simpleFactory.*;

public class RealWeaponFactory extends AbstractFactory{
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String desc) {
        AbstractWeapon weapon = null;
        switch (type) {
            case PISTOL:
                weapon = new Pistol(desc, 100);
                break;
            case MACHINE_GUN:
                weapon = new MachineGun(100, 1000);
                weapon.setDescription(desc);
                break;
            case BAZOOKA:
                weapon = new Bazooka();
                weapon.setDescription(desc);
            default:
                throw new UnsupportedOperationException("Type not covered");
        }
        return  weapon;
    }
}
