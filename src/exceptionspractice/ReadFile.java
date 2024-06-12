package exceptionspractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        String path="/Users/mindtekjava/Desktop/dat.txt";

        FileReader fileReader=null;
        try {
            fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
        } catch(FileNotFoundException exception){
            System.out.println("Invalid file path");
        } catch(IOException exception){
            System.out.println("Error reading file");
        } finally {
            System.out.println("In finally block");
            try {
                fileReader.close();
            }catch(IOException exception){
                System.out.println("Failed to close the reader.");
            }
        }

    }

}
