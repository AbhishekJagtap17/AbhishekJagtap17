package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo20ObjectOutputStream {
    public static void main(String[] args)throws IOException ,ClassNotFoundException{

        File file=new File("student.data");
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student student=(Student)objectInputStream.readObject();
        System.out.println(student);
        objectInputStream.close();
        fileInputStream.close();
    }
}
