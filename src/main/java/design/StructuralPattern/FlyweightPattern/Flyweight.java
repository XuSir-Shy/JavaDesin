package design.StructuralPattern.FlyweightPattern;

/**
 * 享元模式
 * 运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，
 * 而这些对象都很相似，状态变化很小，可以实现对象的多次复用。
 *
 * 享元对象能做到共享的关键是区分了内部状态(Intrinsic State)和外部状态(Extrinsic State)
 * 这里应该是抽象的，这里简单通过两个不同的赋值方式区别内外状态。
 */
public class Flyweight {
    //设置内部状态
    protected String intrinsicState;
    //外部状态
    protected String extrinsicState;

    public Flyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    public void operation(String extrinsicState) {
        this.extrinsicState = extrinsicState;
    }
}
