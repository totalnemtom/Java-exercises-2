package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Reader {
    public void readSingleChar(){
        try {
            FileInputStream fis = new FileInputStream("C://Users//KomPhone//Desktop//text.txt");
            int i = fis.read();
            System.out.println("DONE READ: " + (char) i);
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readMultipleChars(){
        try {
            FileInputStream fis = new FileInputStream("C://Users//KomPhone//Desktop//text.txt");
            int i = 0;
            String result = "";

            while ((i= fis.read())!=-1) {
                result += (char) i;
            }

            System.out.println("DONE READ: " + result);
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
