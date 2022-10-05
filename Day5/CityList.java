package Day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CityList {

	public static void main(String[] args) {
		
		List<String> city = new ArrayList<>();
		city.add("Indore");
		city.add("Bhopal");
		city.add("Bangluru");
		city.add("Delhi");
		city.add("Pune");
		city.add("Mumbai");
		
	
		
		Collections.sort(city);
			System.out.println(city);
	}
}
