package design.StructuralPattern.BridgePattern;

public class BigRefinedAbstraction extends AbstractPen{
    @Override
    public void operation() {
        System.out.println("我是大号的"+color.getAttr()+"毛笔");
    }
}
