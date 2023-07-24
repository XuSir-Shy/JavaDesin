package design.BehavioralPattern.MediatorPattern;

public class TextBox extends Component{
    @Override
    public void update() {
        System.out.println("文本框更新");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }

}
