package design.BehavioralPattern.ChainofResponsibilityPattern;

/**
 * 责任链模式
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，
 * 将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 */
public abstract class Approver {
    //定义后续处理者
    protected Approver successor;
    //审批人姓名
    protected String name;

    public Approver(String name){
        this.name = name;
    }

    public void setSuccessor(Approver approver){
        this.successor = approver;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
