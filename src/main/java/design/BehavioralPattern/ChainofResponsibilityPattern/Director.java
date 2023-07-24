package design.BehavioralPattern.ChainofResponsibilityPattern;

/**
 * 主任类
 */
public class Director extends Approver{

    public Director(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + purchaseRequest.getNumber() + "，金额：" + purchaseRequest.getAmount() + "元，采购目的：" + purchaseRequest.getPurpose() + "。");  //处理请求
        }
        else {
            this.successor.processRequest(purchaseRequest);  //转发请求
        }
    }
}
