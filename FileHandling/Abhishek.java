package FileHandling;

import java.io.File;
import java.io.IOException;

public class Abhishek {
    public static void main(String[] args)throws IOException {
        File file=new File("C:\\Users\\DELL\\Desktop\\Sidd.docx");
        System.out.println("Create new file : "+file.createNewFile());
        System.out.println("Succssfully created new file :");
    }
}
