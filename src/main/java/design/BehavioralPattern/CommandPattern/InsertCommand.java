package design.BehavioralPattern.CommandPattern;

public class InsertCommand extends Command{

    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.insert(args);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }
}
