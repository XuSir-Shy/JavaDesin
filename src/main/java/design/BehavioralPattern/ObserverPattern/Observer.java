package design.BehavioralPattern.ObserverPattern;

/**
 * 观察者模式：定义对象之间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。
 * 观察者
 */
public abstract class Observer {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract void help(); //声明支援盟友方法
    public abstract void beAttacked(AllyControlCenter acc);
}
