package atu.ie;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("My File is located at" + myFile.getAbsolutePath());
    }
}