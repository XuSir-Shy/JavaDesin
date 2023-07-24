package design.StructuralPattern.BridgePattern;

public class SmallRefinedAbstraction extends AbstractPen{
    @Override
    public void operation() {
        System.out.println("我是小号的"+color.getAttr()+"毛笔");
    }
}
