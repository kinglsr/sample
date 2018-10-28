
public class Loops {
	public static void main(String[] args) {
	int i=1;
	/*do {
		System.out.println("the value of i: "+i);
		i++;
	}while(i<=10);
	while(i<=10) {
		System.out.println("number is: "+i);
		i++; */
	for(int x = 10;x>=1;x--) {
		System.out.println("the value of x is "+x);
	}
	System.out.println("--------------even numbers--------");
	for(int x =2; x<=20; x=x+2) {
		System.out.println("the value of x: "+x);
	}
	System.out.println("----------2 table----------");
	for(int x=1;x<=10;x++)
		System.out.println("table of 2: "+x*2);
	System.out.println("----------table of 3--------");
	for(int x=1; x<=10;x++) {
		System.out.println("table of 3: "+"3*"+x+"="+3*x);
	}
	for (int table=1;table<=10;table++) {
		System.out.println("table of " +table);
		for(int x=1;x<=10;x++) {
			System.out.println(table+"*"+x+"=" +table*x);
		}
	}
	}
	
	
	

}
