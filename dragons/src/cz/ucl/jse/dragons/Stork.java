package cz.ucl.jse.dragons;

public class Stork extends Animal implements Flyable {

	public static final String LATIN_NAME = "�apus Maximus";
	
	@Override
	public String fly(int north, int west) {
		
		return "Just flying";
	}

}
