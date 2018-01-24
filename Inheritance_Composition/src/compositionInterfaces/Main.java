package compositionInterfaces;

public class Main {

    public static void main(String[] args) {
	
	Moveable benz = new Mercedes("Benz", 1_200_000);
	
	benz.increaseSpeed();
	
	
    }

}
