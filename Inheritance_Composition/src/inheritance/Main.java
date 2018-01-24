package inheritance;

public class Main {

    public static void main(String[] args) {
	
	Ford focus = new Ford("Focus", "C41211");	
	
	Toyota avensis = new Toyota("Avensis", "A84331");	
	
	int wheels = focus.getWheels();
	
	System.out.println(wheels);
	
	Car.startEngine(focus);
	Car.startEngine(avensis);

    }

}
