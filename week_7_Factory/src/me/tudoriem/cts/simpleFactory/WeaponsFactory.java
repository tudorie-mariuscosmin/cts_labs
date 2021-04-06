package me.tudoriem.cts.simpleFactory;

public class WeaponsFactory {
    public static AbstractWeapon getWeapon(WeaponType type, String description){
        AbstractWeapon weapon = null;
        switch (type) {
            case PISTOL:
                weapon = new Pistol(description, 100);
                break;
            case MACHINE_GUN:
                weapon = new MachineGun(100, 1000);
                weapon.setDescription(description);
                break;
            case BAZOOKA:
                weapon = new Bazooka();
                weapon.setDescription(description);
            default:
                throw new UnsupportedOperationException("Type not covered");
        }
        return  weapon;
    }
}
