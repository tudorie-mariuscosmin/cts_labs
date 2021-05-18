package me.tudoriem.cts.memento;

public class TestMemento {

    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman", 500, "FLy");

        SuperHeroMemento autosave1 = superman.save();

        superman.name = "Batman";
        System.out.println(superman.name);
        superman.load(autosave1);
        System.out.println(superman.name);

    }

}
