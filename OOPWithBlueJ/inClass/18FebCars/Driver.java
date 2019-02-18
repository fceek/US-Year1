
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private String name;
    private Car thecar;
    
    public Driver(String _name) {
        name = _name;
        thecar = new Car();
    }
    
    public String getModel() {
        return thecar.getModel();
    }
    
    
}
