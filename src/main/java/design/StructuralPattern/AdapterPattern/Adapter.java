package design.StructuralPattern.AdapterPattern;


/**
 * 将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，
 * 其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 * 适配器类
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void doSome1() {
        specificRequest();
    }
}
