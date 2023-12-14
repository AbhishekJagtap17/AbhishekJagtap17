package FileHandling;

import javafx.util.converter.LocalDateStringConverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo13ReadFromFileFIS {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\DELL\\IdeaProjects\\Helloworld\\180223.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        int singleByte=fileInputStream.read();
        while(singleByte!=-1){
            System.out.print((char) singleByte);
            singleByte=fileInputStream.read();
        }

        File file1=new File("src/xyz.txt");
        FileInputStream fileInputStream1=new FileInputStream(file1);
        LocalDateTime startTime=LocalDateTime.now();
        int singlebyte1=fileInputStream1.read();
        while (singlebyte1!=-1){
            System.out.print((char) singlebyte1);
            singlebyte1=fileInputStream1.read();
        }
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("\n File successfully read : ");
        System.out.println("Time Required to read the file : "+((endTime.getSecond())-(startTime.getSecond())));
        fileInputStream.close();
    }
}
