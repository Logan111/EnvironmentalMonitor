package receiver;

public class Checker {

    public void checkInLimit(String Key , float value)
    {        
        FactorValidator objToValidate = new FactorValidator();
        
        objToValidate.setAlert(new AlertService() );
        objToValidate.setWarn(new WarnService());
          
        objToValidate.CheckForWarning(value , Key );
        
    }
    
}
