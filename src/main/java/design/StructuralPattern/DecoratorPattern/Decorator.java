package design.StructuralPattern.DecoratorPattern;

public class Decorator extends Person{
    public Person person;

    public Decorator(Person person){
        this.person = person;
    }


    @Override
    public void doSome() {
        person.doSome();
    }
}
