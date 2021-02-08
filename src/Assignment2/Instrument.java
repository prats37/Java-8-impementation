package Assignment2;

public class Instrument implements Guitar, Piano{

	// Approach 1-- call the default method of the specified interface using super
	/*@Override
	public void play() {
		// TODO Auto-generated method stub
		Guitar.super.play();
		Piano.super.play();
	}*/
	
	// Appraoch 2-- create an own method that overrides the default implementation
	public void play() {
		System.out.println("Playing instrument from instrument class");
	}
	
	
	public static void main(String[] args) {
		Instrument i=new Instrument();
		i.play();
	}
}
