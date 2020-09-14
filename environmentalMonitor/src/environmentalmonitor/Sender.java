package environmentalmonitor;

import java.io.*; // import very specific and make sure they are alphabetical 

public class Sender 
{
   public static void whenInvokedWithACsvFilePathThenWritesTheContentOnToTheConsole(String csvFile)
   {
      try 
      {
        File file = new File(csvFile); // variable names to be apt and describing the role
        FileReader fr = new FileReader(file);
          try (BufferedReader br = new BufferedReader(fr))
          {
              String line = "";
              while((line = br.readLine()) != null)
              {
                  System.out.println(line);                  
              }
               
          }catch(IOException obj){ //make sure catch the exception at high level don't use these base level
              System.out.println("Unable to load buffer");
          }
        } catch(IOException ioe){
            System.out.println("File not found exception"); //make sure every method is documented (java doc)
        }
   }
   public static void main(String[] args) {
       //can be any file
       String csvFile = "C:\\Users\\320105361\\Desktop\\Envdetails.csv";
       Sender.whenInvokedWithACsvFilePathThenWritesTheContentOnToTheConsole(csvFile);
   }
}