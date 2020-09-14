/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiver;

/**
 *
 * @author 320105361
 */
public class WarnService implements IwarnReporter{

    @Override
    public void IMakeEveryWarnReport(String message) {
       
       
         System.out.println("Entering into reports that Warn is made due to: " + message + "\n");
        
    }

    @Override
    public void IWarnViaSMS(String message) {
         System.out.println("Warning Via SMS : " + message + "\n");
        
    }

    @Override
    public void IWarnViaSound(String message) {
        
         System.out.println("Warning Via SOUND: " + message + "\n");
        
    }
    
}
