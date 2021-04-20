package me.tudoriem.cts.flyweight;

public class TestFlyweight {
    public static void main(String[] args) {

        ScreenData coordinatesS1 = new ScreenData(100,100,200,"red");
        ScreenData coordinatesS2 = new ScreenData(400,10,80,"blue");
        ScreenData coordinatesT1 = new ScreenData(400,910,40,"green");
        ScreenData coordinatesT2 = new ScreenData(20,120,30,"green");

       ModelFlyweightActions soldier =  Model3DFactory.getModel(ModelTypes.SOLDIER);
       soldier.display(coordinatesS1);
       soldier.display(coordinatesS2);

       ModelFlyweightActions tree = Model3DFactory.getModel(ModelTypes.TREE);
       tree.display(coordinatesT1);
       tree.display(coordinatesT2);
    }
}
