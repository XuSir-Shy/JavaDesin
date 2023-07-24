package design.StructuralPattern.ProxyPattern;

public class Test {
    public static void main(String[] args) {
        Searcher proxy,realSeach;

        realSeach = new RealSearch();

        proxy = new ProxySearch(realSeach);

        proxy.search();
    }
}
