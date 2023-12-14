package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo17WriteCharFileWriter {
    public static void main(String[] args)throws IOException {
        File file=new File("C:\\Users\\DELL\\IdeaProjects\\Helloworld\\170223.txt");
        System.out.println("Create new File "+file.createNewFile());
        FileWriter fileWriter=new FileWriter(file);
        LocalDateTime startTime=LocalDateTime.now();

        for(int index=1;index<100000;index++){
            fileWriter.write("File handling is in progress");
        }
        LocalDateTime endTime=LocalDateTime.now();
        fileWriter.close();
        System.out.println("Write operation complete ");
        System.out.println("Time is taken to write "+(endTime.getSecond()-startTime.getSecond()));

    }
}
