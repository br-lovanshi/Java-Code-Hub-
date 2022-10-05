package C2Prolem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//import FunctionalInterFace.Student;

/*
 * Predicate<Student> : if student marks are less than 500
Consumer<Student>: print the student details
Supplier<Student> : get the Student object with all details(roll, name ,marks)
Function<String, Integer> : get any number in String format and return the number in
Integer format.

*/

class Student {
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"name1",70));
		students.add(new Student(12,"name2",480));
		students.add(new Student(1,"name3",680));
		students.add(new Student(15,"name4",80));
		
		
//		1. Predicate :- It have one boolean mathod test who take genric arguments return boolean value according to the condition.
		
		Predicate<Student> s = i -> i.getMarks() < 500;
//		boolean ans = s.test( Students.add(new Student(10,"name1",70)) );
		System.out.println( s.test( new Student(10,"name1",70)));//true
		System.out.println(s.test(new Student(1,"name2",790)));//false
		
//		2. Consumer :- It will accept genric type of arguments and print(void) the value(result);
		
		Consumer<Student> c = i -> {
			System.out.println("----------");
			System.out.println("id " + i.getId());
			System.out.println("marks " + i.getMarks());
			System.out.println("Name " + i.getName());
		};
		
		c.accept(new Student(10,"name1",70));
		c.accept(new Student(1, "brajesh", 100));
		
		
//		3. Supplier :- It only print the value it supplier  not take any argument it get T type (give) result
		
		Supplier<Student> sp = () ->  new Student(10,"name1",70) {
			
		};
//			
		System.out.println(sp.get());
		
		
//		4. Function :- function take T type of argument and return R value for Emp we pass String num of list and it will return the integer.
		
		
		Function<String,Integer> f = ii ->  Integer.parseInt(ii);
		System.out.println("function " + f.apply("10"));
		
	}
}
 