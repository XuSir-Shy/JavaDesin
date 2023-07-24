package design.BehavioralPattern.StatePattern;

/**
 * 状态模式
 * 允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。
 * 抽象状态类
 */
public abstract class AccountState {

    protected Account account;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();
}
