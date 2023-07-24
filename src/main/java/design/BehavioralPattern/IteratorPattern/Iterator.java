package design.BehavioralPattern.IteratorPattern;

/**
 * 迭代器模式
 * 提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示，其别名为游标
 * 聚合对象只负责存储数据，而遍历数据由迭代器来完成。
 */
public abstract class Iterator {
    public abstract void first();

    public abstract void next();

    public abstract boolean hasNext();

    public abstract Object currentItem();
}
