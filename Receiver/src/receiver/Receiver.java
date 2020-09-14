package receiver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receiver
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String input = br.readLine();
            while(input != null) 
            {
                System.out.println("\n-----------------------------------------------------------------------------\n");
                System.out.println("Receiver is processing: " + input);
                processing obj = new processing();
                obj.whenInvokedWithAStringMakesEntryToHashMapAndInvokesLimitCheck(input);
                input = br.readLine();
            }
        }catch (IOException ioe){ //new to use high level eception not base level
            System.out.println(ioe);
        }
    }
}