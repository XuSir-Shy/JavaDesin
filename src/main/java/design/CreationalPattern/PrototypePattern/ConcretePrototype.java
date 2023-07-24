package design.CreationalPattern.PrototypePattern;

import lombok.Data;

public class ConcretePrototype extends ProtoType{
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public ProtoType cloneP(){
        ProtoType protoType = new ConcretePrototype();
        //protoType.setAttr(this.attr);
        return protoType;
    }

}
