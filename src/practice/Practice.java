package practice;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) throws IOException {

        Bat bat = new Bat();
        process(bat);

       /* System.out.println("Gyula"); //out

        int input = System.in.read(); //in
        System.out.println((char) input);

        System.err.println("ERROR"); //error*/

        Writer w = new Writer();
        Reader r = new Reader();
        /*w.writeMultipleChars();
        r.readMultipleChars();*/

        w.bufferWriter();
        r.readMultipleCharsWithBuffer();


    }

    public static void process(Flyable animal){

        animal.descend();

    }
}
