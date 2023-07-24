package design.StructuralPattern.BridgePattern;

public class Test {
    public static void main(String[] args) {
        AbstractPen pen = new MidRefinedAbstraction();
        pen.setColor(new RedColor());
        pen.operation();
    }
}
