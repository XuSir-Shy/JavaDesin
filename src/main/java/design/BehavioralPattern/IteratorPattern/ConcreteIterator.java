package design.BehavioralPattern.IteratorPattern;

public class ConcreteIterator extends Iterator{

    private ConcreteAggregate object;

    private int cursor;//定义一个游标

    public ConcreteIterator(ConcreteAggregate object) {
        this.object = object;
    }

    @Override
    public void first() {
        System.out.println("第一个");
    }

    @Override
    public void next() {
        System.out.println("下一个");
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
