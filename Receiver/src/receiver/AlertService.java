
package receiver;

public class AlertService implements IAlarmReporter{

    @Override
    public void IAlaramViaSMS(String message) {
        System.out.println("Alerting Via SMS : " + message + "\n");
    }

    @Override
    public void IAlarmViaSound(String message) {
        System.out.println("Alerting Via SOUND: " + message + "\n");
    }

    @Override
    public void IMakeEveryAlarmReport(String message) {
      System.out.println("Entering into reports that alram is made due to: " + message + "\n");
        
    }
    
    
}
