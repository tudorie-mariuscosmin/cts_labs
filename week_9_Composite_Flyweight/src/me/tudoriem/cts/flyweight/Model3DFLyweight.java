package me.tudoriem.cts.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Model3DFLyweight implements  ModelFlyweightActions{
    String name;
    //3d model data
    List<Double> modelPoints = new ArrayList<>();

    public Model3DFLyweight(String name) {
        this.name = name;
    }

    @Override
    public void loadModel() {

    }

    @Override
    public void display(ScreenData data) {
        System.out.println(String.format("Printing %s at coordinates(%f,%f,%f)", name, data.x, data.y, data.z));
    }
}
