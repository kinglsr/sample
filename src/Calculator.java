
public class Calculator {
	int i= 20;
	public int add (int a, int b) {
		
		int x = a+b;
		return x;
	}
	public int sub(int w, int v) {
		int y = w-
				v;
		return y;
		
	}
	public int mul(int w, int v) {
		int z= w*v;
		return z;
		
	}
	public int div(int q, int r) {
		int p= q/r;
		return p;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(2, 3);
		c.div(2, 1);
		c.mul(2, 3);
		c.sub(3, 4);
		
		System.out.println(c.sub(3, 4));
	}

}
