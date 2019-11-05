package file.system;

import java.io.File;

public class FileTest {

    public static void main(String[] args) {
        File file=new File("/Users/dineshseervi/Desktop/Projects/tempFile121");
        System.out.println(" getAbsolutePath "+file.getAbsolutePath());
        System.out.println(" getParent       "+file.getParent());
        System.out.println(" getName         "+file.getName());
        System.out.println(" exists          "+file.exists());
        if(file.exists())
        {
            System.out.println("Is writeable:"+file.canWrite());
            System.out.println("read "+file.canRead());
            System.out.println("isDirectory "+file.isDirectory());
            System.out.println("length      "+file.length());
            System.out.println("");
            System.out.println("");
        }


    }
}
