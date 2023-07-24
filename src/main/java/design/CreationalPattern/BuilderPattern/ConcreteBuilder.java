package design.CreationalPattern.BuilderPattern;

public class ConcreteBuilder extends Builder{
    @Override
    void buildPartA() {
        super.product.setPartA("A");
    }

    @Override
    void buildPartB() {
        super.product.setPartB("B");
    }

    @Override
    void buildPartC() {
        super.product.setPartC("C");
    }
}
