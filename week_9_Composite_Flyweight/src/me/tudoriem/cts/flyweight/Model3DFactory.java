package me.tudoriem.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {

    static Map<String, ModelFlyweightActions> models = new HashMap<>();

    static{// eager instantiation of factory
        models.put(ModelTypes.SOLDIER.toString(), new Model3DFLyweight("Soldier"));
        models.put(ModelTypes.TREE.toString(), new Model3DFLyweight("Tree"));
    }

    static  ModelFlyweightActions getModel(ModelTypes type){
        return models.get(type.toString());
    }
}
