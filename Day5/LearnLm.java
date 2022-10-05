package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterFace.Student;

@FunctionalInterface
interface inter {
	public void sum(int s );
}
public class LearnLm {

	public static void main(String[] args) {
		
//		inter i = (s) -> {
//		System.out.println(s.getId());
//		System.out.println(s.getMarks()+1);
//		System.out.println(s.getName().toUpperCase());
////		return s;
//		};
		
//		List<Student> i = new ArrayList<>();
//		
//		i.add(new Student(1,"brajesh",919));
//		i.add(new Student(13,"brajdesh",929));
//		i.add(new Student(122,"brfddgajesh",99));
//		i.add(new Student(11,"brsdfajesh",939));
//		
//		Collections.sort(i,(s1,s2) -> s1.getMarks()<s2.getMarks() ? +1 :-1);
//		
//		i.forEach(s -> System.out.println(s));
		
//		inter i = System.out::print;
//		i.sum(20);
		
//		Consumer<Student> c = s -> {
//				System.out.println(s.getId());
//				System.out.println(s.getMarks());
//				System.out.println(s.getName());
//		};
//		c.accept(new Student(0, "brajesh", 200));
//		java.util.function.Function;
//		Function<Student, String> f = s -> s.getMarks()>500 ? "Pass" : "fail";
//		System.out.println(f.apply(new Student(1, "1", 800)));
//		System.out.println(f.apply(new Student(3, "a", 90)));
//		List<String> list =  Arrays.asList("ram","raj","ravi","hari","chandra");
//		
//		list.forEach(i -> System.out.println(i.toUpperCase()));
		
		
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 750));
		students.add(new Student(12, "N2", 450));
		students.add(new Student(13, "N3", 650));
		students.add(new Student(14, "N4", 850));
		students.add(new Student(15, "N5", 410));
		
		
//		students.removeIf(t -> t.getMarks() < 500);
//		students.forEach(s-> System.out.println(s));
		
//		Stream<Student> s1 = students.stream();
////		Stream<Student> s2 = s1.filter(t -> t.getMarks() < 500 );
//		s2.forEach(System.out::println);
//		
//		
//		students.stream().filter(s -> s.getMarks() < 500)
//		.forEach(System.out::println);
		
//		students.stream().filter(t -> t.getMarks() > 800);
//		
//		List<Student> filterdList = students.stream()
//				.filter(s -> s.getMarks() > 500)
//				.collect(Collectors.toList());
//		
//		
//		filterdList.forEach(System.out::println);
		 
		List<String> al = new ArrayList<>();
		al.add("ramesh");
		al.add("suresh");
		al.add("mukesh");
		al.add("ajay");
		
//		Stream<String> s1 = al.stream();
//		List  s2 = s1.map(s -> {
//			return "walcome " + s;
//		}).collect(Collectors.toList());
//		
//		s2.forEach(System.out::println);
		
//		al.stream().map(s -> "walcome " + s)
//		.forEach(System.out::println);
		
//		Collectors collectors = null;
//		Stream<String> s1 = al.stream();
//		List ans = s1.map(s->"Walcome " + s)
//				.collect(Collectors.toList());
//		System.out.println(ans);
		
//		al.stream()
//				.map(s -> s.toUpperCase())
//				.forEach(System.out::println);
//		
//		Stream<String> s1 = al.stream();
//		
//		List ans = s1.map(s -> s.toUpperCase())
//				.collect(collectors.toList());
//		List<String> ans = al.stream()
//				.map(s -> s.toUpperCase()) 
//				.collect(Collectors.toList());
//		System.out.println(ans);
		
		List<String> st = Arrays.asList("2","3","4","5" , "7");
		 
		List<Integer> num = st.stream().map(s -> Integer.parseInt(s))
				.collect(Collectors.toList());
		
		num.stream().filter(s -> s%2 == 1).forEach(System.out::println);
		
	}
}
