package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo18WriteCharWithBufferedWriter {
    public static void main(String[] args)throws IOException {
        File file=new File("src/170223.txt");
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        LocalDateTime startTime=LocalDateTime.now();
        for (int index=1;index<100000;index++){
            System.out.println("File handling is in progress");
        }
        bufferedWriter.close();
        fileWriter.close();
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("File write with buffered Writer complete");
        System.out.println("Time required to complete "+(endTime.getSecond()-startTime.getSecond()));

    }
}
