package design.BehavioralPattern.MediatorPattern;

public class List extends Component{
    @Override
    public void update() {
        System.out.println("集合更新");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }
}
