package design.BehavioralPattern.CommandPattern;

public class ModifyCommand extends Command{

    public ModifyCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    public void execute() {
        configOperator.modify(this.args);
    }

}
