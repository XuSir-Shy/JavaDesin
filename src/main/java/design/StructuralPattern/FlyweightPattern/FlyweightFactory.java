package design.StructuralPattern.FlyweightPattern;

import java.util.HashMap;

public class FlyweightFactory {
    //定义一个HashMap当作享元池，用来存实际对象
    private HashMap<String, Object> flyweight = new HashMap<>();

    public Flyweight getFlyweight(String key){
        if (flyweight.containsKey(key)){
            return (Flyweight) flyweight.get(key);
        }else {
            Flyweight flyweight1 = new Flyweight(key);
            flyweight.put(flyweight1.intrinsicState,flyweight1);
            return flyweight1;
        }
    }
}
