package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo08GetFileSize {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\DELL\\Desktop\\Class Notes.docx");
        File file2=new File("C:\\Users\\DELL\\IdeaProjects\\Helloworld\\180223.txt");

        System.out.println(file.length());
        System.out.println(file2.length());
    }
}
