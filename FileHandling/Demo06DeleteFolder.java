package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo06DeleteFolder {
    public static void main(String[] args) throws IOException {
        File directory=new File("Temp file");
        System.out.println(directory.delete());
    }
}
