package Assignment2;

public interface Guitar {
	
	public default void play() {
		System.out.println("Playing Guitar from Guitar interface");
	}
	
}
