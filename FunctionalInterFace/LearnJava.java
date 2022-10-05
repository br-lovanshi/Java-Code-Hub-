package FunctionalInterFace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LearnJava {

	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("1","2","three","four");
//		
//		list.stream().forEach(s -> System.out.println(s));
//		List<String> ans = list.stream().distinct().collect(Collectors.toList());
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Name1",850));
		students.add(new Student(12,"Name2",750));
		students.add(new Student(13,"Name3",50));
		students.add(new Student(14,"Name4",150));
		students.add(new Student(15,"Name5",750));
		Collections.sort(students,(s1,s2) -> s1.getMarks()>s2.getMarks()?1:-1)
		;
		students.forEach(System.out::println);
//		Set<Student> ans = 
//				students.stream().filter(s->s.getMarks()<500)
//				.collect(Collectors.toSet());
//		ans.stream().forEach(i-> System.out.println(i.getMarks()));
//			students.stream().map(s -> s.getName().toUpperCase()).forEach(i -> System.out.println(i));
//		students.stream().filter(s -> s.getMarks() > 500).forEach(t -> System.out.println(t));
	}
}
