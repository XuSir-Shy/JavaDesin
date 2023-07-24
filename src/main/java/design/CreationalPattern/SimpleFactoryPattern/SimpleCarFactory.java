package design.CreationalPattern.SimpleFactoryPattern;

import java.util.Objects;

/**
 * 简单工厂模式
 * 创建实例的工厂
 * 又称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。在简单工厂模式中，可以根据参数的不同返回不同类的实例。
 * 优点：责任分割；减少对使用者的参数记忆；提高系统灵活性
 * 缺点：当需要创建新的实例对象时候，需要修改工厂类，违背了开闭原则
 */
public class SimpleCarFactory {
    public Animal createAnimal(String name){
        Animal animal = null;
        if (Objects.equals(name, "dog")){
            animal = new Dog();
        }else if (Objects.equals(name, "cat")){
            animal = new Cat();
        }
        return animal;
    }
}
