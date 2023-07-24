package design.BehavioralPattern.TemplateMethodPattern;

public class SavingAccount extends Account{
    @Override
    void CalculateInterest() {
        System.out.println("死期计算利息");
    }
}
