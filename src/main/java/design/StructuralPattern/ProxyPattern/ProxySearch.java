package design.StructuralPattern.ProxyPattern;

public class ProxySearch extends Searcher{

    private Searcher searcher;

    public ProxySearch(Searcher searcher){
        this.searcher = searcher;
    }

    public void PreDo(){
        System.out.println("我在实际操作之前执行");
    }

    public void AfterDo(){
        System.out.println("我在实际操作之后执行");
    }

    @Override
    void search() {
        PreDo();
        searcher.search();
        AfterDo();
    }
}
