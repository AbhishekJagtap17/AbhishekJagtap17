package FileHandling;

import java.io.File;

public class Demo11ListFileNames {
    public static void main(String[] args) {
        File file=new File("src/FileHandling");
        String[] fileNames=file.list();
        for(String filename:fileNames){
            System.out.println(filename);
        }
    }
}
