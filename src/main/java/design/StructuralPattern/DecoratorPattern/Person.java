package design.StructuralPattern.DecoratorPattern;

/**
 * 装饰者模式
 *  装饰模式可以在不改变一个对象本身功能的基础上给对象增加额外的新行为
 *  动态地给一个对象增加一些额外的职责，就增加对象功能来说，装饰模式比生成子类实现更为灵活。装饰模式是一种对象结构型模式。
 */
public abstract class Person {
    abstract void doSome();
}
