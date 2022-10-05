package Day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindeMax {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,3,4,66,6,53,3,2);
//	collection
//	int nas = Collections.max(list);
//	System.out.println(nas);
	
//	lemda  
	
	list.stream()
	.max(Comparator.comparing(i -> i)).ifPresent(max -> System.out.println(max));
}
}
