package environmentalmonitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;// import very specific and make sure they are alphabetical 
import java.io.IOException;


public class Sender 
{
    /**
     *
     * @param csvFile
     * @throws IOException
     */
    public static void whenInvokedWithACsvFilePathThenWritesTheContentOnToTheConsole(String csvFile) throws IOException{
      try 
      {  
          //file ecists and csv reader
          //can do both in one class
          //Ireader fof any format 
        File file = new File(csvFile); // variable names to be apt and describing the role
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while((line = br.readLine()) != null)
        {
            System.out.println(line);                  
        }
        } catch(FileNotFoundException ioe){
            System.out.println("File not found exception"); //make sure every method is documented (java doc)
        }
   }
   public static void main(String[] args) throws IOException {
       //can be any file
       String csvFile = "C:\\Users\\320105361\\Desktop\\Envdetails.csv";
       Sender.whenInvokedWithACsvFilePathThenWritesTheContentOnToTheConsole(csvFile);
   }
}