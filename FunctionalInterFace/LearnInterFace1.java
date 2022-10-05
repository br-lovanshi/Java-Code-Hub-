package FunctionalInterFace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface printDetailSt{
	void print(Student st);
}

interface Calculator {
	
	int cal(int a,int b);
}
public class LearnInterFace1 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"name1",70));
		students.add(new Student(12,"name2",480));
		students.add(new Student(1,"name3",680));
		students.add(new Student(15,"name4",80));
		
		Collections.sort(students,(s1,s2)-> s1.getId()>s2.getId()?+1:-1);
		students.stream().filter(s->s.getMarks()>250).forEach(i->System.out.println(i));
//		Collections.sort(students,(s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
//System.out.println(students);
//		Calculator c = (a,b) -> {
//			return a+b;
//		};
//		Calculator mc = (a,b) -> a-b;
//		System.out.println(c.cal(10, 30));
//		System.out.println(mc.cal(93, 03));
//		printDetailSt i = s -> {
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getMarks());
//		};
//		
//		i.print(new Student( 1,"Brajsh",999));
	}
}
