package me.tudoriem.cts.test;

import me.tudoriem.cts.prototype.Tree3DModel;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Tree3DModel tree = new Tree3DModel("green", 100);
        Tree3DModel tree1 = (Tree3DModel) tree.clone();
        Tree3DModel tree2 = (Tree3DModel) tree.clone();

    }

}
