package Day5;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface


interface PrintList {
abstract void display(List<String> city);
}

public class PrintListProblem4 {

	public static void main(String[] args) {
		
		List<String> city = new ArrayList<>();
		
		city.add("Indore");
		city.add("Bhopal");
		city.add("Bangluru");
		city.add("Delhi");
		city.add("Pune");
		city.add("Mumbai");
		
		PrintList i = (List<String> s) -> s.forEach(System.out::println);
		i.display(city);
		
	}
}
