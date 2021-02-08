package Assignment3;

public class MyClassWithLambda{

	public static void main(String[] args) {
		WordCount totalWords=(str)->{
			String[] arr=str.split(" ");
			return (arr.length);
		};
		System.out.println("Total Word:" +totalWords.count("Count my total words"));
	}
	

}
