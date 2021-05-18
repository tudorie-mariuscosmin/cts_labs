package me.tudoriem.cts.memento;

public class SuperHero {

    String name;
    private int lifePoints;
    String magic;

    public SuperHero(String name, int lifePoints, String magic) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.magic = magic;
    }

    public void attack(){
        System.out.println("Is attacking...");
    }
    public void heal(){
        System.out.println("Is healing...");
    }
    public void move(){
        System.out.println("Is moving...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public  SuperHeroMemento save(){
        return new SuperHeroMemento(name, lifePoints, magic);
    }

    public void load(SuperHeroMemento memento){
        this.name = memento.getName();
        this.lifePoints = memento.getLifePoints();
        this.magic = memento.getMagic();
    }
}
