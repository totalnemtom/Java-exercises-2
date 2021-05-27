package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Writer {

    private Object FileOutputStream;

    public void writeSingleChar(){
        try {
            FileOutputStream fos = new FileOutputStream("C://Users//KomPhone//Desktop//text.txt");
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("DONE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeMultipleChars(){
        try {
            FileOutputStream fos = new FileOutputStream("C://Users//KomPhone//Desktop//text.txt");
            String text = "Something to write";
            byte a[] = text.getBytes(StandardCharsets.UTF_8);
            fos.write(a);
            fos.flush();
            fos.close();
            System.out.println("DONE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

