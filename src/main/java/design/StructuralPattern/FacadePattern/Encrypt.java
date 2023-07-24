package design.StructuralPattern.FacadePattern;

public class Encrypt {
    public String encrypt(String text){
        System.out.println("我负责加密");
        return "完成加密:"+text;
    }
}
