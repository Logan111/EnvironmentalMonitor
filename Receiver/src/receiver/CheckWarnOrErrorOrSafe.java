package receiver;
public class CheckWarnOrErrorOrSafe {
    
    int[] temp_error_levels = {0 , 40};
    int[] humid_error_level = {0 ,90};
   
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
    
    public void CheckForWarning(float value , int low, int high , String parameterName )
    {
        if(value <= (float)low || value >= (float)high )
        {
            //CheckForError(value ,temp_error_levels[0] ,temp_error_levels[1] , humid_error_level[0] , humid_error_level[1] , parameterName );
            if ( "Temparature".equals(parameterName))
            {
             CheckForError(value , temp_error_levels[0] ,temp_error_levels[1] , parameterName );
            }
            if("Humidity".equals(parameterName) ) 
            {
               CheckForError(value , humid_error_level[0] ,humid_error_level[1] , parameterName );
            } 
        }
        else
        {
            System.out.println("Norma" + parameterName + "level \n");
        }
    }
    
    public void CheckForError(float value , int low, int high ,  String parameterName)
    {
        if(value <= (float)low || value >= (float)high )
        {
            System.out.println("ERROR due to "  +  parameterName + " reading do, raise an ALERT \n");
            String message  = "There is a breach in " +  parameterName + " ";
            alert.IAlaramViaSMS(message);
            //alert.IAlarmViaSound(message);
        }
        else
        {
            System.out.println("WARNING due to " + parameterName + " Reading do, raise a WARN_MESSAGE \n");
            String message  = "There is a breach in " + parameterName + " ";
            warn.IWarnViaSound(message);
            //warn.IWarnViaSMS(message);
        }
        
    }
    
}

/* public void CheckWarningTemp(float value , int low , int high , String parameterName )
    {
        if(value < (float)low || value > (float)high )
        {
            CheckErrorTemp(value ,temp_error_levels[0] ,temp_error_levels[1] , parameterName );
        }
        else
        {
            System.out.println("Norma" + parameterName + "level \n");
        }
    }
        
    public void CheckWarningHumid(float value , int low , int high, String parameterName )
    {
        if(value < (float)low || value > (float)high)
        {
            CheckErrorHumid(value , humid_error_level[0] , humid_error_level[1] ,  parameterName );
        }
        else
        {
            System.out.println("Safer" + parameterName + " Levels \n");
        }
    }*/
    
    /*public void CheckErrorTemp(float value , int low, int high ,  String parameterName )
    {
         if(value < (float)low || value > (float)high )
        {
            System.out.println("Error temperature reading raise an alert \n");
            String message  = "There is a breach in " +  parameterName + " ";
            alert.IAlaramViaSMS(message);
        }
        else
        {
            System.out.println("Warning Temparature limits so raise an warning \n");
            String message  = "There is a breach in " + parameterName + " ";
            warn.IWarnViaSound(message);
        }
        
    }
    
     public void CheckErrorHumid(float value , int low , int high , String parameterName )
    {
        
        if(value < (float)low || value > (float)high)
        {
            String message  = "There is a breach in " + parameterName + " ";
            System.out.println("Error Humid Levels  raise an alert \n");
            alert.IAlarmViaSound(message);
        }
        else
        {
            String message  = "There is a breach in " + parameterName + " ";
            System.out.println("Warning Humid Levels  raise a warning \n");
            warn.IWarnViaSMS(message);
            
        }
        
    }*/