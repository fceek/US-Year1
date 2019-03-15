public class Car
{
    private String make;
    private String model;
    private long capacity;
    private double value;
    
    private String carReg;
    private int gear;

    public Car(String _make, String _model) {
        make = _make;
        model = _model;
        capacity = 0;
        value = 0;
        gear = 0;
    }
    
    public Car() {
        make = "Ferarri";
        model = "lester";
        capacity = 2000;
        value = 2131313.1;
        gear = 0;
    }
    
    public void setCapacity(long _capacity) {
        capacity = _capacity;
    }
    
    public void setValue(double _value) {
        value = _value;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public long getCapacity() {
        return capacity;
    }
    
    public double getValue() {
        return value;
    }
    
    public int getGear() {
        return gear;
    }
    
    public void changeGear(int _gear) {
        if (_gear >= -1 && _gear <=3) gear = _gear;
    }
    
    public String soundHorn() {
        return "dudu";
    }
    
    public void setReg(String _carReg) {
        if (_carReg.length() == 4 && _carReg.substring(0,2).equals("A5")) carReg = _carReg;
    }
    
    public String getReg() {
        return carReg;
    }
    
    public String toString() {
        return make + " " + model + " " + carReg;
    }
}
