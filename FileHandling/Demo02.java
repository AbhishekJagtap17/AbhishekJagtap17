package FileHandling;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        File directory=new File("Temporary Files");
        System.out.println(directory.mkdir());
    }
}
