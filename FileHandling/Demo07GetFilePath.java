package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo07GetFilePath {
    public static void main(String[] args)throws IOException {
        File file=new File("180223.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.length());
    }
}
