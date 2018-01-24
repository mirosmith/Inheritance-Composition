package composition;

public class Main {

    public static void main(String[] args) {
	
	Mercedes benz = new Mercedes("Benz", 1_200_000);
	
	int wheels = benz.getWheels();
	
	System.out.println(wheels);
    }

}
