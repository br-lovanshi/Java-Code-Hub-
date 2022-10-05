package Day6;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

 class Student1 {
	private int id;
	private String name;
	private int marks;
	public Student1(int id, String name, int marks) {
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
		Student1 other = (Student1) obj;
		return id == other.id ;}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
 
public class Problem3 {

	
	
	public static void main(String[] args) {
		
		Map<String,Student1> map = new HashMap<>();
		map.put("Indore" , new Student1(2, "br", 900));
		map.put("Bhopal", new Student1(3,"vicky",300));
		map.put("Mumbai",new Student1(4, "an", 220));
		
//map.entrySet().stream()
//.sorted(Map.Entry.comparingByValue((s1,s2)-> s1.getMarks() > s2.getMarks() ? 1 : -1))
//.forEach(i -> System.out.println(i.getKey()  + " " + i.getValue()));
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue((s1,s2) -> s1.getMarks() > s2.getMarks()?1:-1))
		.forEach(i->System.out.println(i.getKey()+" "+i.getValue()));

	}
}
