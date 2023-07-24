package design.CreationalPattern.AbstractFactoryPattern;

public class ConCreateFactory2 extends AbstractFactory{
    @Override
    AbstractProductA createA() {
        return new ConCreateProductA2();
    }

    @Override
    AbstractProductB createB() {
        return new ConCreateProductB2();
    }
}
