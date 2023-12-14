package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo05DeleteFile {
    public static void main(String[] args) throws IOException {
        File file=new File("190223.txt");
        System.out.println(file.delete());
    }
}
