
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller
{
    // instance variables - replace the example below with your own
    private Heater h1;
    private double switchTime;
    /**
     * Constructor for objects of class Controller
     */
     public Controller()
    {                
        h1 = new Heater();
        switchTime = 0;
    }

    public void switchOn()
    {       
        if (!h1.getStatus()) {
            h1.switchOffOn();
            calculateTime();
        }
        System.out.println(h1);
    }

    public void switchOff()
    {
        if (h1.getStatus()) {
            h1.switchOffOn();
            calculateTime();
            System.out.println("Time on : " + switchTime + "s");
        }
        System.out.println(h1);
    }
    
    public void turnUp()
    {
        boolean timeFlag = false;
        
        if (!h1.getStatus()) timeFlag = true;
        
        h1.makeWarmer();
        if (timeFlag) calculateTime();
        System.out.println(h1);
    }
    
    public void turnDown()
    {
        boolean timeFlag = false;
        
        if (h1.getStatus()) timeFlag = true;
        
        h1.makeCooler();
        if (!h1.getStatus() && timeFlag) {
            calculateTime();
            System.out.println("Time on : " + switchTime + "s");
        }
        System.out.println(h1);
    }
    
    /**
     * calculate the power us at the PREVIOUS setting
     */
    private double calculateTime()
    {
        if (h1.getStatus()) {
            switchTime = System.currentTimeMillis();
        }
            else {
                switchTime = (System.currentTimeMillis() - switchTime) / 1000;
            }
            
        return switchTime;
    }

}
