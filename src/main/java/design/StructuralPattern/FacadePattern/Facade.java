package design.StructuralPattern.FacadePattern;

/**
 * 外观模式
 * 外部与一个子系统的通信必须通过一个统一的外观对象进行，
 * 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
public class Facade {
    /**
     * 此处实例文件加密
     */
    private FileReader fileReader;

    private Encrypt encrypt;

    private FileWriter fileWriter;

    public Facade(){
        fileReader = new FileReader();
        encrypt = new Encrypt();
        fileWriter = new FileWriter();
    }

    public void FileEncrypt(String filePath){
        String text = fileReader.read(filePath);
        String code = encrypt.encrypt(text);
        fileWriter.write(code);
    }
}
