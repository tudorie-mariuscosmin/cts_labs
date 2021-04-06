package me.tudoriem.cts.factoryMethod;

import me.tudoriem.cts.simpleFactory.Pistol;
import me.tudoriem.cts.simpleFactory.SuperHero;
import me.tudoriem.cts.simpleFactory.WeaponType;

public class TestFactory {

    public static void main(String[] args) {
        boolean kidsMode = true;
        SuperHero superman;
        if(kidsMode){
             superman = new SuperHero("Superman", new WaterPistol());
        }else{
            superman = new SuperHero("Superman", new Pistol("pistol", 50));
        }


        AbstractFactory weaponFactory = kidsMode ? new WaterWeaponFactory() : new RealWeaponFactory();

        superman = new SuperHero("Superman", weaponFactory.getWeapon(WeaponType.BAZOOKA,"Pistol"));
        superman.setWeapon(weaponFactory.getWeapon(WeaponType.MACHINE_GUN,"MG"));

    }
}
