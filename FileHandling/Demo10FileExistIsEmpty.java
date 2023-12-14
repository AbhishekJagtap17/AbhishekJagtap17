package FileHandling;

import java.io.File;

public class Demo10FileExistIsEmpty {
    public static void main(String[] args) {
        File file=new File("180223.txt");
        System.out.println("File Exist : "+file.exists());

    }
}
