package receiver;
import java.util.Map;

/**
 *
 * @author 320105361
 */
public class FactorValidator {
    
    
    EnvironmentalFactors env_fact = new EnvironmentalFactors();
 
    Map<String, int[]> envornmental_factors = env_fact.getMap(); //like initializer
    
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
    
    public void CheckForWarning(float value , String parameterName )
    {
        String parameterNameUsedToPass = parameterName + "_warnLevels";
        int[] range = envornmental_factors.get(parameterNameUsedToPass);
            int low = range[0];
            int high = range[1];
        
        if(value <= (float)low || value >= (float)high )
        {
            CheckForError(value , parameterName );
        }
        else
        {
            System.out.println("Norma" + parameterName + "level \n");
        }
           
    }
    
    public void CheckForError(float value ,  String parameterName)
    {
        String parameterNameUsedToPass = parameterName + "_errorLevels"; 
        int[] range = envornmental_factors.get(parameterNameUsedToPass);
       
            int low = range[0];
            int high = range[1];
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
