package design.BehavioralPattern.MediatorPattern;

/**
 * 中介模式
 * 用一个中介对象（中介者）来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。
 */
public abstract class Mediator {
    public abstract void componentChanged(Component c);
}
