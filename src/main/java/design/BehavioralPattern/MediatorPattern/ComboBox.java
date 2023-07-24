package design.BehavioralPattern.MediatorPattern;

public class ComboBox extends Component{
    @Override
    public void update() {
        System.out.println("ComboBox更新");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}
