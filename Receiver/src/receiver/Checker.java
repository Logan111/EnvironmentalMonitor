
package receiver;

import java.util.HashMap;
import receiver.AlertService;
import receiver.WarnService;

public class Checker {
// hardcoding for time being
    int[] temp_warning_level = {4 , 37};
    int[] temp_error_levels = {0 , 40};
    int humid_warning_level = 70;
    int humid_error_level = 90;
    
    
    
    
    AlertService alert;
    
    WarnService warn;
    
    
    void setAlert(AlertService alert_requested)
    {
        alert = alert_requested;
    }
    
    void setWarn( WarnService warn_requested)
    {
        warn = warn_requested;
    }
    
    
    
    public void checkInLimit(HashMap<String, Float> map)
    {
        String parameterName = (String) map.keySet().toArray()[0];
        System.out.println("Paramter = " + parameterName + "\n");
        if ( "Temparature".equals(parameterName))
        {
            CheckWarningTemp(map.get(parameterName) ,temp_warning_level[0] , temp_warning_level[1] );
        }
        if("Humidity".equals(parameterName) ) 
        {
            CheckWarningHumid(map.get(parameterName) ,humid_warning_level);
        }   
    }
    
    public void CheckWarningTemp(float value , int low , int high )
    {
        if(value < (float)low || value > (float)high )
        {
            CheckErrorTemp(value ,temp_error_levels[0] ,temp_error_levels[1] );
        }
        else
        {
            System.out.println("Normal Temparature \n");
        }
    }
    
    
    public void CheckWarningHumid(float value , int limit )
    {
        if(value > (float)limit)
        {
            CheckErrorHumid(value , humid_error_level);
        }
        else
        {
            System.out.println("Safer Humid Levels \n");
        }
    }
    
    public void CheckErrorTemp(float value , int low, int high )
    {
         if(value < (float)low || value > (float)high )
        {
            System.out.println("Error temperature reading raise an alert \n");
            String message  = "There is a breach in Temparature";
            alert.IAlaramViaSMS(message);
        }
        else
        {
            System.out.println("Warning Temparature limits so raise an warning \n");
            String message  = "There is a breach in Temparature";
            warn.IWarnViaSound(message);
        }
        
    }
    
     public void CheckErrorHumid(float value , int limit )
    {
        
        if(value > (float)limit)
        {
            String message  = "There is a breach in Humidity";
            System.out.println("Error Humid Levels  raise an alert \n");
            alert.IAlarmViaSound(message);
        }
        else
        {
            String message  = "There is a breach in Humidity";
            System.out.println("Warning Humid Levels  raise a warning \n");
            warn.IWarnViaSMS(message);
            
        }
        
    }
    
}
