package design.StructuralPattern.DecoratorPattern;

public class Test {
    public static void main(String[] args) {
        Person p1,p2;
        p1 = new ConcreatePerson();
        p2 = new ConcreateDecorator(p1);

        p2.doSome();
    }
}
