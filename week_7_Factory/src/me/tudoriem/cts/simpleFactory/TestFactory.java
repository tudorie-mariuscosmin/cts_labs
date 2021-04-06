package me.tudoriem.cts.simpleFactory;

public class TestFactory {
    public static void main(String[] args) {
        SuperHero superMan = new SuperHero("SuperMan", new Pistol("Pistol", 100));
        superMan.setWeapon(new MachineGun(500, 1000));
        superMan.setWeapon(new Bazooka());




        SuperHero batman = new SuperHero("Batman", WeaponsFactory.getWeapon(WeaponType.PISTOL, "Pistol"));
        batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
        batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Boom"));
    }
}
