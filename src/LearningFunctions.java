
public class LearningFunctions {
	
	static int a=10;
	static int b=20;
	
	public static void print() {
		System.out.println("LearnngFunctions");
	}
	public static void addNumbers() {
		int c = a+b;
		System.out.println("addition of numbers is : "+c);
	}
	public static int addNumbers(int r, int s) {
		int w=r+s;
		return w;
	}

	public static void main(String[] args) {
		print();
		addNumbers();
	int  w = addNumbers(20,40);
	System.out.println(w);

	}

}
