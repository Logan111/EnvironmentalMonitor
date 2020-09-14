package receiver;
import java.util.HashMap;

public class Checker {
// hardcoding for time being
    int[] temp_warning_level = {4 , 37};
    int[] temp_error_levels = {0 , 40};
    int[] humid_warning_level = {35 ,70};
    int[] humid_error_level = {0 ,90};
    
    public void checkInLimit(HashMap<String, Float> map)
    {
        CheckWarnOrErrorOrSafe objToInvokeMethods = new CheckWarnOrErrorOrSafe();
        objToInvokeMethods.setAlert(new AlertService());
        objToInvokeMethods.setWarn(new WarnService());
        
        String parameterName = (String) map.keySet().toArray()[0];
       
        if ( "Temparature".equals(parameterName))
        {
            objToInvokeMethods.CheckForWarning(map.get(parameterName) ,temp_warning_level[0] , temp_warning_level[1] , parameterName );
        }
        if("Humidity".equals(parameterName) ) 
        {
            objToInvokeMethods.CheckForWarning(map.get(parameterName) ,humid_warning_level[0], humid_warning_level[1] ,parameterName);
        } 
    }
    
}
