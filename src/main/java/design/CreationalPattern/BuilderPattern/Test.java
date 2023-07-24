package design.CreationalPattern.BuilderPattern;

public class Test {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        Product construct = director.construct();

        System.out.println(construct);
    }
}
