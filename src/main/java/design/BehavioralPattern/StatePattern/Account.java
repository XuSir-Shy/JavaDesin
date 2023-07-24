package design.BehavioralPattern.StatePattern;

public class Account {

    private AccountState state;

    private String owner;

    private double balance = 0;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
    }

    public double getBalance(){
        return this.balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount){
        System.out.println(this.owner+"存款:"+amount);
        //调用状态对象得取款方法
        state.deposit(amount);
        System.out.println("现在的余额为："+this.balance);
        System.out.println("现在账户状态为:"+this.state.getClass().getName());
        System.out.println("-----------------------------");
    }

    //取款
    public void withdraw(double amount){
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount); //调用状态对象的withdraw()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this. state.getClass().getName());
        System.out.println("-----------------------------");
    }

    public void computeInterest(){
        state.computeInterest();
    }
}
