package Day6;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Problem2 {

	public static void main(String[] args) {
		
		
//		1.Predicate 
		
		Predicate<Integer> p = i -> i<0;
		System.out.println(p.test(30));
		System.out.println(p.test(-3));
		
//		2. Consumer
		
		Consumer c = s -> System.out.println("hello " + s);
		c.accept("brajesh");
		
//		3. Supplier
		Supplier<String>  s = () -> "Hllow Brajesh";
		System.out.println(s.get());
		
//		4.Function
		
		Function<String,Integer> f = sf -> Integer.parseInt(sf);
		System.out.println(f.apply("20")-1/2+3);
		
	}
}
