package design.StructuralPattern.BridgePattern;

public class MidRefinedAbstraction extends AbstractPen{
    @Override
    public void operation() {
        System.out.println("我是中号的"+color.getAttr()+"毛笔");
    }
}
