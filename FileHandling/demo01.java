package FileHandling;

import java.io.File;
import java.io.IOException;

//Create new file :  ref.createNewFile()

public class demo01 {
    public static void main(String[] args) throws IOException {
        File file=new File("170223.txt");
        System.out.println(file.createNewFile());
    }
}
