package FunctionalInterFace;
@FunctionalInterface
interface Inter{
	void sayHello(String name);
}
interface convert {
	int sToN (String n);
}
interface interP {
	void printNonStatic(int n);
}
public class LearnMathodR {
public static void main(String[] args) {
	
	Inter i = name -> System.out.println("HEllo " + name);
	
	i.sayHello("Brajesh");
//	static mathod referance 
	
	convert c = Integer::parseInt;
	System.out.println(c.sToN("39"));
//	Lemda expresstion
	convert cv = s -> Integer.parseInt(s);
	System.out.println(cv.sToN("20"));
	
//	non static mathod reference 
	
	interP i1 = System.out::println;
	i1.printNonStatic(10);
	
	interP i2 = n -> System.out.println(n);
	i2.printNonStatic(40);
}
}
