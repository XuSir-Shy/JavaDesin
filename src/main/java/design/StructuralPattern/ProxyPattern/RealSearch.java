package design.StructuralPattern.ProxyPattern;

public class RealSearch extends Searcher{
    @Override
    void search() {
        System.out.println("我是真实对象，正在查询……");
    }
}
