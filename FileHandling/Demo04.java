package FileHandling;
//renameFolder:


import java.io.File;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        File directory=new File("Temporary Files");
       directory.renameTo(new File("Temp File"));
    }
}
