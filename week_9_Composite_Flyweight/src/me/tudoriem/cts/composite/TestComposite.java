package me.tudoriem.cts.composite;

public class TestComposite {

    public static void main(String[] args) {
        AbstractNode  gr1 = new Group("red team");
        gr1.addNewNode(new NPC("Marius", 100));
        gr1.addNewNode(new NPC("Cosmin", 200));

        AbstractNode gr2 = new Group("blue team");
        gr2.addNewNode(new NPC("John", 100));
        gr2.addNewNode(new NPC("Tank", 500));

        AbstractNode levelGroup = new Group("level 2");
        levelGroup.addNewNode(new NPC("Bosulik", 1000));
        levelGroup.addNewNode(gr1);
        levelGroup.addNewNode(gr2);

        levelGroup.attack("SuperMan");
        levelGroup.retreat();
        levelGroup.getNode(0).move();
    }
}
