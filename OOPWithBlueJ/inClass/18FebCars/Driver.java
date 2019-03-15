
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
    
    public String getDriverName() {
        return name;
    }
    
    public String getModel() {
        return defCar.getModel();
    }
    
    public String getMake() {
        return defCar.getMake();
    }
    
    public String getReg() {
        return defCar.getReg();
    }
    
    public void changeGear(int _gear) {
        defCar.changeGear(_gear);
    }
    
    public void regCar(String _reg) {
        defCar.setReg(_reg);
        System.out.println(defCar);
    }
    
    public String soundHorn() {
        return defCar.soundHorn();
    }
}
