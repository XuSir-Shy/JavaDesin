package design.BehavioralPattern.IteratorPattern;

public class ConcreteAggregate extends Aggregate{
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
