package design.BehavioralPattern.CommandPattern;

import java.util.ArrayList;

/**
 * 请求发送类
 */
public class ConfigSettingWindow {
    private ArrayList<Command> commands = new ArrayList<>();

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(String args){
        command.execute(args);
        commands.add(command);
    }
    public void save(){
        FileUtil.write(commands);
    }

    public void recover() {
        ArrayList list;
        list = FileUtil.readCommands();

        for (Object obj : list) {
            ((Command)obj).execute();
        }
    }
}
