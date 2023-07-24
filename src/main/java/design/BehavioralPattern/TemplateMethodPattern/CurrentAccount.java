package design.BehavioralPattern.TemplateMethodPattern;

public class CurrentAccount extends Account{
    @Override
    void CalculateInterest() {
        System.out.println("活期计算利息");
    }
}
