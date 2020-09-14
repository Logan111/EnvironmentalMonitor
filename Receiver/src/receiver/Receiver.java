
package receiver;
import receiver.processing;

import java.io.*;
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
                System.out.println("\n---------------------\n receiver is processing:" + input);
                processing obj = new processing();
                obj.whenInvokedWithAStringMakesEntryToHashMapAndInvokesLimitCheck(input);
                input = br.readLine();
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}