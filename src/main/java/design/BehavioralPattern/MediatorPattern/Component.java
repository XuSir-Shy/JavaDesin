package design.BehavioralPattern.MediatorPattern;

/**
 * 所有功能按钮的抽象父类
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public  void change(){
        mediator.componentChanged(this);
    }

    public abstract void update();
}
