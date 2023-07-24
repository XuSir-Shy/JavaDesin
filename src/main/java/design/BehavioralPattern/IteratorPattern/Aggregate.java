package design.BehavioralPattern.IteratorPattern;

/**
 * 抽象聚合类
 * 它用于存储和管理元素对象
 */
public abstract class Aggregate {
    public abstract Iterator createIterator();
}
