package compositionInterfaces;

public class Mercedes implements Moveable {
    
    private Car car;

    public Mercedes(String model, int price) {	
	this.car = new Car(model, price);
    }

    public Car getCar() {
        return car;
    }    
    

    @Override
    public void increaseSpeed() {
	
	car.increaseSpeed();
	
    }
    

}
