package exceptionspractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        URL url=new URL("google.com");

        System.out.println("End of code");

        Thread.sleep(4000);

        System.out.println("Wake up");

        try {
            FileReader fileReader=new FileReader("");
        } catch (FileNotFoundException e) {
        }

    }

}
