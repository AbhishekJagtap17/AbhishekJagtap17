package FileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo15WriteFilesBOS {
    public static void main(String[] args) throws IOException {
        File file=new File("src/xyz.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        LocalDateTime startTime=LocalDateTime.now();
        for(int index=1;index<1000000;index++){
            bufferedOutputStream.write(97);
        }
        bufferedOutputStream.close();
        fileOutputStream.close();
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("Time required to complete"+(endTime.getSecond()-startTime.getSecond()));
    }
}
