package design.BehavioralPattern.VisitorPattern;

/**
 * 抽象员工类
 */
public abstract class Employee {
    public abstract void accept(Department department);
}
