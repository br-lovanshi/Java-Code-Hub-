package SortMapUsingValue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class SortByValue {

	public static Map<String,Student> sortMapValue(HashMap<String, Student> map){
	
		Set<Map.Entry<String, Student>> set = map.entrySet();
		
		Set<Map.Entry<String, Student>> sortedSet = new TreeSet<>(new StudentCompreTo());
		sortedSet.addAll(set);
		
	    Map<String,Student> finalMap = new  LinkedHashMap<>();
		
		for(Map.Entry<String, Student> i : sortedSet) {
			finalMap.put(i.getKey(), i.getValue());
		}
		return finalMap;
		
	}
	
public static void main(String[] args) {
		
		HashMap<String,Student> map = new HashMap<>();
		

		map.put("Delhi", new Student(23, "Mohit", 120));
		map.put("Noida", new Student(12, "Sita", 120));
		map.put("Kanpur", new Student(89, "Sunil", 789));
		map.put("Banaras", new Student(19, "Bamlesh", 489));
		map.put("Bihar", new Student(90, "Rakesh", 280));
		
		Map<String, Student> FinalMap = sortMapValue(map);
		
		for(Map.Entry<String, Student> i : FinalMap.entrySet()) {
			System.out.println(i.getKey());
			System.out.println("====-======");
			Student s = i.getValue();
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getMarks());
		}
	}
}
