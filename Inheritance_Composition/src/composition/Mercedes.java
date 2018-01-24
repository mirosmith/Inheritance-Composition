package composition;

public class Mercedes {
    
    private Car car;

    public Mercedes(String model, int price) {	
	this.car = new Car(model, price);
    }

    public Car getCar() {
        return car;
    }
    
    public int getWheels( ) {
	
	int num = Integer.parseInt(car.getWheels());
	
	return num;
    }
    

}
