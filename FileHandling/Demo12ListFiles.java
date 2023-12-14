package FileHandling;

import java.io.File;

import java.io.IOException;

public class Demo12ListFiles {
    public static void main(String[] args) throws IOException {
        File folder=new File("src/FileHandling");
        String []fileNames= folder.list();
       for( String fileName: fileNames){
           System.out.println(fileName);
       }

       File folder2=new File("src/fileHandling");
       File[]files=folder2.listFiles();
       for (File file:files){
           System.out.println(file.getName()+"\t"+file.length());
       }


       File folder01=new File("src/exceptionHandling");
       String[]fileName=folder01.list();
       for(String file02:fileName){
           System.out.println(file02);
       }

       File [] files02=folder01.listFiles();
       for(File file02:files02){
           System.out.println(file02+ "\t"+file02.length());
       }
    }
}
