package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo14WritefilesFOS {
    public static void main(String[] args) throws IOException {
        File file=new File("src/xyz.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        LocalDateTime startTime= LocalDateTime.now();
        for(int index=0;index<1000000;index++){
            fileOutputStream.write(97);
        }
        fileOutputStream.close();
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("Successfully Written to the file ");
        System.out.println("Time taken to write : "+ (endTime.getSecond()-startTime.getSecond()));
    }
}
