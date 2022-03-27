public class HomeWorkApp {
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
		}
	
	public static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	
	public static void checkSumSign() {
		int a = 1;
		int b = 1;
		int c = a + b;
		if (c < 0) {
			System.out.println("Sum is negative");
		} else {
			System.out.println("Sum is positive");
		}
	}
	
	public static void printColor() {
		int value = -6;
		if (value <= 0) {
			System.out.println("Red");
		}
		if (value > 0 && value <= 100) {
			System.out.println("Yellow");
		} 
		if (value > 100) {
			System.out.println("Green");
		}
	}
	
	public static void compareNumbers() {
		int a = 2;
		int b = 3;
		if (a >= b) {
			System.out.println("a>=b");
		} else {
			System.out.println("a<b");
		}
	}
}