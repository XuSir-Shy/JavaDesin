package design.CreationalPattern.BuilderPattern;

/**
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式是一种对象创建型模式
 * Builder:抽象建造者
 */
public abstract class Builder {
    //定义目标产品对象
    protected Product product = new Product();

    //定义构建目标产品各部分方法
    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    //返回产品对象
    public Product getProduct(){
        return this.product;
    }
}
