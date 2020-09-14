
package receiver;

import java.util.HashMap;

public class processing {
    
    HashMap<String,Float> map=new HashMap<>();
    
    public void whenInvokedWithAStringMakesEntryToHashMapAndInvokesLimitCheck(String received_from_sender)
    {
        String tempArr[];
        tempArr = received_from_sender.split(":");
        //first index of temparr has parameter type and second index is its value
        
        String Key = tempArr[0];
        float value = delimitter_fun(tempArr[1]);
        map.put(Key , value);
        
        Checker checkobj  = new Checker();
        checkobj.checkInLimit(map);
   
    }
    
    public float delimitter_fun(String withchar)
    {  
        String digits = withchar.replaceAll("[^0-9.]", "");
        return Float.parseFloat(digits);
    }
    
}
