package design.BehavioralPattern.StrategyPattern;

/**
 * 策略模式
 * 定义一系列算法类，将每一个算法封装起来，并让它们可以相互替换，
 * 策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。
 * 打折算法类
 */
public abstract class Discount {
    public abstract double calculate(double price);
}
