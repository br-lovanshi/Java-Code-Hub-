package Day7;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		List<Student> hs = new ArrayList<>();
		hs.add(new Student(1,"Brajesh",299));
		hs.add(new Student(2,"ribak",99));
		hs.add(new Student(3,"yaj",2339));
		hs.add(new Student(4,"jar",3200));
		hs.add(new Student(5,"anam",329));
		hs.add(new Student(6,"rajesh",100));
		
//		hs.stream().max(s -> s.getMarks()).forEach(s -> System.out.println(s));
	}
}
