package design.CreationalPattern.FactoryMethodPattern;

/**
 * 工厂方法模式
 * 目的：解决简单工厂模式违反开闭原则。抽象工厂负责提供创建产品的接口，通过不同的工厂实现类创建不同的产品
 * 优点：1.调用者无需知道实例创建过程，只需要关注对应的创建工厂。2.多态设计，让工厂自主确定创建类型。3.遵守开闭原则
 * 缺点：1.当有新类型实例加入的时候，需要创建对应的新工厂，一定程度上增加了系统的复杂性。
 */
public interface LoggerFactory {
    Logger createLogger();
}
