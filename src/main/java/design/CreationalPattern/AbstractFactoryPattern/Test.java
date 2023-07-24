package design.CreationalPattern.AbstractFactoryPattern;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new ConCreateFactory1();
        AbstractProductB b1 = abstractFactory1.createB();
        AbstractProductA a1 = abstractFactory1.createA();
        a1.doSome();
        b1.doSome();

        AbstractFactory abstractFactory2 = new ConCreateFactory2();
        AbstractProductA a2 = abstractFactory2.createA();
        AbstractProductB b2 = abstractFactory2.createB();
        a2.doSome();
        b2.doSome();
    }
}
