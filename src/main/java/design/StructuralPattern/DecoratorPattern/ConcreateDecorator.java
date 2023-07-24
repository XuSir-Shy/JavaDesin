package design.StructuralPattern.DecoratorPattern;

public class ConcreateDecorator extends Decorator{
    public ConcreateDecorator(Person person) {
        super(person);
    }

    public void doSome(){
        System.out.println("我再人人之前做一些事情");
        super.doSome();
        System.out.println("我再人人之后做一些事情");
    }
}
