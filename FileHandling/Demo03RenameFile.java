package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo03RenameFile {
    public static void main(String[] args)throws IOException {
        File file=new File("170223.txt");
        System.out.println(file.renameTo(new File("190223.txt")));
    }
}
