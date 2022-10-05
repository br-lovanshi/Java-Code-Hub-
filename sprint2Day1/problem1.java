package sprint2Day1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
public class problem1
{

	
	



	public static  Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
			
	    Comparator<Map.Entry<Employee, String>> compareto = (s1,s2)->{
	    	return s1.getKey().getSalary() > s2.getKey().getSalary() ? 1 :-1;
	    };
		Set<Map.Entry<Employee, String>> set = originalMap.entrySet();
		
		Set<Map.Entry<Employee, String>> sortedSet = new TreeSet<>(compareto);
		sortedSet.addAll(set);
		
		Map<Employee,String> lhm = new LinkedHashMap<>();
		
		for(Map.Entry<Employee, String> i : originalMap.entrySet()) {
			lhm.put(i.getKey(), i.getValue());
		}
		return lhm;
		
	}

	
	
 public static void main(String[] args) {
	
	 
	 Map<Employee,String> map = new HashMap<>();
	 
	 map.put(new Employee(23, "Rakesh", 65888), "Delhi");
		map.put(new Employee(12, "Avdesh", 8452), "Kanpur");
		map.put(new Employee(19, "Raju", 97352), "Patna");
		map.put(new Employee(34, "Bamlesh", 1211), "Vanaras");
		map.put(new Employee(10, "Raghvendra", 78666), "Bihar");
		
		 Map<Employee,String> sortedMap =  sortMapUsingEmployeeSalary(map);
	 for(Map.Entry<Employee, String> i : sortedMap.entrySet()) {
		 System.out.println(i.getValue());
		 System.out.println("==========");
		 Employee e = i.getKey();
		 System.out.println("name " + e.getName());
		 System.out.println("id " + e.getEmployeeId());
		 System.out.println("salary " + e.getSalary());
	 }
	 
}
}
