
public class MethodCalling {
	
public static void main(String[] args) {
	MethodCalling m = new MethodCalling();
	m.go();
	m.go1();
	m.go2();
	go3();// not required to create object because it is a static methodusing in static area
	
	//static -- allowed- only static
	//non static-- allows static// non- static
}
public void go()
{
	System.out.println("inside go method");
	
}
public void go1() {
	System.out.println("inside go1 method");
	
}
public void go2() {
	System.out.println("inside go2 method");
}
public static void go3() {// we are using static keyword so go3 method we are directly calling in main method.
	System.out.println("inside go3 method");
}
}
