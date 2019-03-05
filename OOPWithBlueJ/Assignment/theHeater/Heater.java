
/**
 * The Heater
 * 
 * @author (Patrick) 
 * @version (4 3 2019)
 */
public class Heater
{

    private long increment;
    private long maxPower;
    private long power;
    private String model;
    private boolean off_on;

    public Heater()
    {
        maxPower = 2000;
        increment = 500;
        model = "Valiant";
        power = 0;
        off_on = false;
    }

    public Heater (long _maxPower, int _Increment, String _Model)
    {
        maxPower = _maxPower;
        increment = _Increment;
        model = _Model;
        power = 0;
        off_on = false;
        
    }

    public boolean switchOffOn()
    {
        off_on = !off_on;
        if (!off_on) power = 0;
        return off_on;
    }

    public double makeWarmer()
    { 
        if (!off_on) off_on = true;
        if ( (power + increment) < maxPower ) power += increment;
            else {
                power = maxPower;
                System.out.println(" Reached power limit ! ");
            }
            
        return power;
    }

    public double makeCooler () 
    {  
        if ( (power - increment) > 0 ) power-=increment;
            else {
                power = 0;
                off_on = false;
            }
            
        return power;
    }

    public double getPower()
    { 
        return power;
    } 

    public long getMaxPower()
    { 
        return maxPower;
    } 

    public String getModel()
    {
        return model;
    }
    
    public long getInc()
    {
        return increment;
    }

    public boolean getStatus()
    {
        return off_on;
    }
    
    public String toString()
    {
        String switchStatus;
        if (off_on) switchStatus = "ON";
            else switchStatus = "OFF";
        return("Heater Model: " + model + " | Max power: " + maxPower + " | Current Power: " + power + " | " + switchStatus);
    }

}