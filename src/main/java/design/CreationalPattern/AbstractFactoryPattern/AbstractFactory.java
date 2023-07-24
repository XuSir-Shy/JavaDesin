package design.CreationalPattern.AbstractFactoryPattern;

/**
 * 抽象工厂模式
 * 当一个工厂等级结构可以创建出分属于不同产品等级结构的一个产品族中的所有对象时，抽象工厂模式比工厂方法模式更为简单、更有效率。
 * 抽象工厂存在开闭原则倾向性：当新增一个产品族，只需要新增一个工厂类即可。但是新增一个产品等级结构，需要修改所有已有工厂类。
 */
public abstract class AbstractFactory {
    abstract AbstractProductA createA();

    abstract AbstractProductB createB();
}
