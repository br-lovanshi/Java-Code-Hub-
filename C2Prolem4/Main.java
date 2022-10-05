package C2Prolem4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("one","two","Three","four","five","six","seven","eight","nine","ten");
			
		List<String> newList = name.stream().filter(i -> i.length()%2== 0)
							   .map(i-> i.toUpperCase()).collect(Collectors.toList());
		
//		
//		Collections.sort(newList);
//		Collections.reverse(newList);
//		newList.stream().sorted(o1, o2) -> o1
		
		
		newList.sort((p1, p2) -> p2.compareTo(p1));
		System.out.println("Original List -");
		name.forEach(System.out::println);
		System.out.println("Tranfomed List-");
		newList.forEach(System.out::println);
				
	}

}
