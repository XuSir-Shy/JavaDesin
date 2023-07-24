package design.CreationalPattern.SimpleFactoryPattern;

public class Test {
    public static void main(String[] args) {
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        Animal dog = simpleCarFactory.createAnimal("dog");
        dog.doSomething();
    }
}
