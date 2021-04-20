package me.tudoriem.cts.composite;

public class NPC extends AbstractNode{
    String name;
    int power;

    public NPC(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void addNewNode(AbstractNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteNode(AbstractNode node) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public AbstractNode getNode(int index) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void attack(String playerName) {
        System.out.printf("%s is attacking %s! \n", name, playerName);
    }

    @Override
    public void retreat() {
        System.out.printf("%s is retreating! \n", name);
    }

    @Override
    public void move() {
        System.out.printf("%s is moving! \n", name);
    }
}
