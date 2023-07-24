package design.StructuralPattern.FlyweightPattern;

public class Test {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight red = factory.getFlyweight("red");
        Flyweight blue = factory.getFlyweight("blue");
        Flyweight blue1 = factory.getFlyweight("blue");
        Flyweight blue2 = factory.getFlyweight("blue");
    }
}
