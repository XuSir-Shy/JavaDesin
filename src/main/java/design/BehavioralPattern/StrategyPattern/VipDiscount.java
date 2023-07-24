package design.BehavioralPattern.StrategyPattern;

public class VipDiscount extends Discount{
    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        System.out.println("增加积分");
        return price * 0.5;
    }
}
