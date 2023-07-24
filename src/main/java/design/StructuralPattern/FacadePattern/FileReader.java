package design.StructuralPattern.FacadePattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReader {
    public String read(String filePath) {
        System.out.println("我负责读取文件");
        return "读取完成："+filePath;
    }
}
