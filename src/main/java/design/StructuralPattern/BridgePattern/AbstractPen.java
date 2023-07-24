package design.StructuralPattern.BridgePattern;

/**
 * 抽象部分
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 */
public abstract class AbstractPen {
    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void operation();
}
