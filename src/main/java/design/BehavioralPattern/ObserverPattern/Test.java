package design.BehavioralPattern.ObserverPattern;

public class Test {
    public static void main(String[] args) {
        AllyControlCenter controlCenter = new ConcreteAllyControlCenter("Promise");

        Observer palyer1 = new Player("1");
        Observer palyer2 = new Player("2");
        Observer palyer3 = new Player("3");
        Observer palyer4 = new Player("4");
        Observer palyer5 = new Player("5");
        Observer palyer6 = new Player("6");

        controlCenter.join(palyer1);
        controlCenter.join(palyer2);
        controlCenter.join(palyer3);
        controlCenter.join(palyer4);
        controlCenter.join(palyer5);
        controlCenter.join(palyer6);

        palyer2.beAttacked(controlCenter);
    }
}
