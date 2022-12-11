package atu.ie;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("My File is located at" + myFile.getAbsolutePath());
        try{
            FileWriter myWriter = new FileWriter(myFile, true);//would need (myFile, true) to keep data
            myWriter.write("\nKnuckle");//permanently rewriting
            myWriter.write("\nappended at end?");//canny use println, need \n for new line
            myWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}