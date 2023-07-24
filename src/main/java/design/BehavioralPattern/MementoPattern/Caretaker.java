package design.BehavioralPattern.MementoPattern;

/**
 * 负责人
 * 负责人又称为管理者，它负责保存备忘录，但是不能对备忘录的内容进行操作或检查
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento=memento;
    }
}
