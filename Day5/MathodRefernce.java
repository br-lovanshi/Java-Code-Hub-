package Day5;


@FunctionalInterface
interface X{
public int convetStringToNumber(String s);
}

public class MathodRefernce {
public static void main( String[] args ) {
	
//	Lemda expe 
	
	X i = s -> Integer.parseInt(s);
	
	System.out.println(i.convetStringToNumber("39"));
	
	
//	Mathod ref 
	
	X a = Integer::parseInt;
	System.out.println(a.convetStringToNumber("99"));
	
}
}
