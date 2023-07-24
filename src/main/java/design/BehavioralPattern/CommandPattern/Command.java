package design.BehavioralPattern.CommandPattern;

import java.io.Serializable;

/**
 * 将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。
 * 因为需要将对象写入文件中，需要实现序列化接口
 */
public abstract class Command implements Serializable {
    //命令名称
    private String name;
    //命令参数
    protected String args;
    //接收者对象引用
    protected ConfigOperator configOperator;

    public Command(String name){
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void execute();

    public abstract void execute(String args);
}

