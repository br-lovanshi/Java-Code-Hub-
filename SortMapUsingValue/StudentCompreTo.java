package SortMapUsingValue;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentCompreTo implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getMarks() > o2.getValue().getMarks()? +1 : -1;
	}
	
	

	
	
}
