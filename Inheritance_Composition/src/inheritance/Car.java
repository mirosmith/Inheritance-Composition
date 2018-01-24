package inheritance;

public class Car {
    
    private String model;
    private String license;
    
    public Car(String model, String license) {	
	this.model = model;
	this.license = license;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }   
    
    public static void startEngine(Car car) {
	System.out.println(car.getModel() + "(" + car.getLicense() + ") started engine.");
    }
    
    // if you change implementation (for ex. return type) of this method, 
    // the code in main method will break
    // alternative is use of composition
    public int getWheels() {
	return 4;
    }
    

}
