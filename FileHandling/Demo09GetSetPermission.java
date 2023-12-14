package FileHandling;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;


public class Demo09GetSetPermission {
    public static void main(String[] args)throws IOException {
        File file=new File("180223.txt");
        File file2=new File("C:\\Users\\DELL\\Desktop\\Class Notes.docx");

        System.out.println("Size : "+file.length());
        System.out.println("Read permission : "+file.canRead());
        System.out.println("Write Perrmission : "+file.canWrite());
        System.out.println("Execute Permission "+file.canExecute());
        //change the permission :
        file.setWritable(true);
        System.out.println("Last Modified Date : "+file.lastModified());

        System.out.println("Size : "+file2.length());
        System.out.println("Read permission : "+file2.canRead());
        System.out.println("Write Perrmission : "+file2.canWrite());
        System.out.println("Execute Permission "+file2.canExecute());
        //change the permission :
        file2.setWritable(true);
        System.out.println("Last Modified Date : "+file.lastModified());
    }
}
