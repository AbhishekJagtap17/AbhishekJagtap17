package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo19ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //Serilization:
        Student student =new Student(1,"Sachin","Pune");
        File file=new File("Student.data");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Successfully object is written ");
    }
}
