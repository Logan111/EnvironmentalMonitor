
package receiver;

import java.util.HashMap;
import java.util.Map;

public class processing {
    //think of tuples coz thetre might be other delimiters like fahrenheit etc....
    HashMap<String,Float> map=new HashMap<String,Float>();
      
    
    
    public void whenInvokedWithAStringMakesEntryToHashMapAndInvokesLimitCheck(String received_from_sender)
    {
        String tempArr[];
        tempArr = received_from_sender.split(":");
        //first index of temparr has parameter type and second index is its value
        
        String Key = tempArr[0];
        float value = delimitter_fun(tempArr[1]);
        map.put(Key , value);
        
        //now we pass this map to check limits with respective key type
        Checker checkobj  = new Checker();
        
        checkobj.setAlert(new AlertService());
        checkobj.setWarn(new WarnService());
        
        checkobj.checkInLimit(map);
        
        
        
        
        
                  
        
        //printing map
        for(Map.Entry m : map.entrySet()){    
        System.out.println("KEY = " + m.getKey()+" VALUE = "+m.getValue() + "\n");    
       }
    }
    
    public float delimitter_fun(String withchar)
    {  
        String digits = withchar.replaceAll("[^0-9.]", "");
        return Float.parseFloat(digits);
    }
    
}
