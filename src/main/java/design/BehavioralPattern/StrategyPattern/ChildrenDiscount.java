package design.BehavioralPattern.StrategyPattern;

public class ChildrenDiscount extends Discount{
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        return price - 10;
    }
}
