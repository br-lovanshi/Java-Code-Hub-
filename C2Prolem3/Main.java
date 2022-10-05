package C2Prolem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import C2Prolem2.Student;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"name1",700,"Indore"));
		students.add(new Student(12,"name2",480,"BHopal"));
		students.add(new Student(1,"name3",680,"Dheli"));
		students.add(new Student(15,"name4",80,"Pune"));
		
		
		List<Employee> emp = students.stream()
				.filter(i -> i.getMarks() > 500)
				.map( st -> (new Employee(st.getId(), st.getName(),st.getMarks()*10000, st.getAddress()))
						).collect(Collectors.toList());
		
		emp.stream().forEach(i -> System.out.println(i));
		
		
	}
}
