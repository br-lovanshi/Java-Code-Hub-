package Day7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem4 {

	public static void main(String[] args) {
		
		Set<Student> hs = new HashSet<>();
		
		hs.add(new Student(1,"Brajesh",299));
		hs.add(new Student(2,"ribak",99));
		hs.add(new Student(3,"yaj",2339));
		hs.add(new Student(4,"jar",3200));
		hs.add(new Student(5,"anam",329));
		hs.add(new Student(6,"rajesh",100));
		
		List<Student> ans = hs.stream().filter(s -> s.getMarks() < 500 )
				.collect(Collectors.toList());
		ans.stream().forEach(s -> System.out.println(s));
		
		
	}
}
