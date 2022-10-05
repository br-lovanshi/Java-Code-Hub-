package FunctionalInterFace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* dont't need to creat mathod again and again, not need to write lots of code ,
 *java lemda expresstion is treated as a function so is will not create .file
 * sort code ,implement f interface in fp */


public class LearnLemda {

	public static void main(String[] args) {
		
//		List<Student> list = new ArrayList<>();
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(10,"name1",780));
//		students.add(new Student(12,"name2",480));
//		students.add(new Student(14,"name3",680));
//		students.add(new Student(15,"name4",580));
		
		Map<String,Student> map = new HashMap<>();
		map.put("dheli", new Student(10,"name1",780));
		map.put("Mumbail",new Student(11,"aman",80));
		map.put("INDORO", new Student(12,"Brajsh",1000));
		map.put("BHopal", new Student(13,"name4",70));
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue((s1,s2) -> s1.getMarks() > s2.getMarks() ? 1 : -1 ))
		.forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
//		map.entrySet().stream()
//		.sorted(Map.Entry.comparingByValue(
//				(s1,s2) ->s1.getMarks() > s2.getMarks() ? 1 : -1 ))
//		.forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
		
		
		
//		Set<Entry<String, Student>> kv = map.entrySet();
//		
//		Set<Entry<String,Student>> tset = new TreeSet<>(
//				(s1,s2) -> s1.getValue().getMarks()>s2.getValue().getMarks() ? +1 : -1);
//		tset.addAll(kv);
//		
//		tset.forEach(i -> System.out.print(i.getKey() + " " + i.getValue()));
//		tset.forEach(System.out::println);
		
//		list = students.stream().filter(s -> s.getName().equals("name1")).collect(Collectors.toList());
//		list.forEach(System.out::println);
		
//		students.stream().map(s -> s.getMarks()+100 ).forEach(s -> System.out.println(s));
//		students.stream().forEach(s -> System.out.println(s.getName()));
//		students
//				.stream()
//				.filter(s -> s.getMarks() > 500)
//				.forEach(s -> System.out.println(s));
//		List<Student> anotherLIst = students.stream()
//				.filter(s -> s.getMarks() < 100)
//				.collect(Collectors.toList());
				
		
//		List<Integer> lst = Arrays.asList(1,2,2,32,21,1,1,12,3,3,21);
//		 lst.stream().distinct().forEach(System.out::println);
////		
//		 lst.stream().filter(i -> i%2 == 1).map(s -> s > 1).forEach(System.out::println);
//		 Set<Integer> set = lst.stream().collect(Collectors.toSet());
//		System.out.println(set);
//		List<Integer> ans = lst.ma().distinct().map(s -> s+2).collect(Collectors.toList());
//		System.out.println(ans);
//		lst.stream().max(i -> i >0)
		
//		List<String> str = Arrays.asList("1","1","2","4","5","6","8","9");
//		 str.stream().mapToDouble(Integer::parseInt).forEach(System.out::println);
//		
	}
}
