package design.CreationalPattern.AbstractFactoryPattern;

public class ConCreateFactory1 extends AbstractFactory{
    @Override
    AbstractProductA createA() {
        return new ConCreateProductA1();
    }

    @Override
    AbstractProductB createB() {
        return new ConCreateProductB1();
    }
}
