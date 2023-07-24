package design.BehavioralPattern.TemplateMethodPattern;

/**
 * 模板方法模式：定义一个操作中算法的框架，而将一些步骤延迟到子类中。
 * 模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public abstract class Account {
    public boolean Validate(String account, String password){
        //模拟登录
        if (account.equals("admin") && password.equals("123")){
            return true;
        }else {
            return false;
        }
    }

    abstract void CalculateInterest();

    public void Display(){
        System.out.println("显示利息");
    }

    //模板方法
    public void Handle(String account, String password){
        if(!Validate(account,password)){
            System.out.println("账户信息错误");
            return;
        }
        CalculateInterest();
        Display();
    }
}

