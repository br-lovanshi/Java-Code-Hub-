package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
public static void main(String[] args) {
	
	
	List<Integer> list = Arrays.asList(2,3,4,5);
	
	System.out.println("Original list : -- ");
	list.forEach(System.out::println);
	List<Integer> ans  =list.stream().map(s -> s*s).collect(Collectors.toList());
	
	System.out.println("final list : -- ");
	ans.stream().forEach(s-> System.out.println(s));
	
}
}
