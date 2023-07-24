package design.BehavioralPattern.TemplateMethodPattern;

public class Test {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.Handle("admin","123");
    }
}
