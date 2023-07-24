package design.BehavioralPattern.StatePattern;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("Promise",2000);
        account.withdraw(1000);
        account.withdraw(1000);
        account.withdraw(2000);
        account.withdraw(2000);
    }
}
