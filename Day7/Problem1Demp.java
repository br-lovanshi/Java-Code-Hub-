package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Producst {
	private int productId ;
	private String productName ;
	private int Quantity,price;
	
	public Producst(int productId, String productName, int quantity, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		Quantity = quantity;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producst other = (Producst) obj;
		return productId == other.productId;
	}

	@Override
	public String toString() {
		return "Producst [productId=" + productId + ", productName=" + productName + ", Quantity=" + Quantity
				+ ", price=" + price + "]";
	}
	
	
	
	
}
public class Problem1Demp {
	
	public static void main(String[] args) {
		List<Producst> list = new ArrayList<>();
		
		list.add(new Producst(1, "phone", 2, 91990));
		list.add(new Producst(2, "Laptop", 13, 92990));
		list.add(new Producst(3, "Car", 2, 999990));	
		list.add(new Producst(4, "DSLR", 18, 9299));
		list.add(new Producst(5, "OFFice", 6, 933990));
		
//		Stream<Producst> s1 = list.stream();
		System.out.println("orignal list");
		list.forEach(System.out::println);
		List<Producst> ans = list.stream().filter(s -> s.getQuantity() > 10 )
				.collect(Collectors.toList());
		Collections.sort(ans,(s1,s2)-> s1.getPrice()> s2.getPrice() ? +1 : -1);
		
		System.out.println("---------");
		System.out.println("sorted list");
		ans.forEach(System.out::println);
		
	}

}
