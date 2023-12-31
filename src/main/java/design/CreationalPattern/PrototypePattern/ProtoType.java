package design.CreationalPattern.PrototypePattern;

/**
 * 使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式.
 * 声明克隆方法的接口
 */
public abstract class ProtoType {

    abstract ProtoType cloneP();
}
