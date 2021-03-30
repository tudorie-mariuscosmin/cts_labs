package me.tudoriem.cts.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable {
    String color;
    int height;
    ArrayList<Integer> points;

    public  Tree3DModel(String  color, int height){
        this.height = height;
        this.color = color;
        System.out.println("Loading the 3d model");

        try {
            Thread.sleep(2000);
            Random random = new Random(1000);
            this.points = new ArrayList<>();
            for(int i=0; i<20; i++){
                this.points.add(random.nextInt(100));
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Model loaded");
    }

    private Tree3DModel(){

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Tree3DModel copy = new Tree3DModel();
        copy.color = this.color;
        copy.height = this.height;
        copy.points = (ArrayList<Integer>) this.points.clone();
        return copy;
    }
}
