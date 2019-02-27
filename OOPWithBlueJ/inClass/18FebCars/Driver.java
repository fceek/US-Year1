
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    private String name;
    private Car defCar;
    
    public Driver(String _name) {
        name = _name;
        defCar = new Car();
    }
    
    public String getModel(Car thecar) {
        return thecar.getModel();
    }
    
    public String getMake(Car thecar) {
        return thecar.getMake();
    }
    
    public String getReg(Car thecar) {
        return thecar.getReg();
    }
    
    public void changeGear(int _gear, Car thecar) {
        thecar.changeGear(_gear);
    }
    
    public void regCar(String _reg, Car thecar) {
        thecar.setReg(_reg);
        System.out.println(thecar);
    }
    
    public String soundHorn(Car thecar) {
        return thecar.soundHorn();
    }
}
