
package receiver;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentalFactors {
  
    /**
     * any additional parameters can be added directly here
     * implementing this for Robust code
     * Future scope can be maintained
     */
    public static Map<String, int[]> envornmental_factors = new HashMap<>();
    
    static {
            
                envornmental_factors.put("Temparature_warnLevels", new int[] { 4, 37 });
                envornmental_factors.put("Humidity_warnLevels", new int[] { 35, 70 });
		envornmental_factors.put("Temparature_errorLevels", new int[] { 0, 40 });
                envornmental_factors.put("Humidity_errorLevels", new int[] { 0 , 90 });
	}
    
        public Map<String, int[]> getMap() {
		return envornmental_factors;
	}
    
}
