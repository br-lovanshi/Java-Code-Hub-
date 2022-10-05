package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Product {
	private int Productid;
	private String Productname;
	private int quantity, price;
	public Product(int productid, String productname, int quantity, int price) {
		super();
		Productid = productid;
		Productname = productname;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		Productid = productid;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Productid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Productid == other.Productid;
	}
	@Override
	public String toString() {
		return "Product [Productid=" + Productid + ", Productname=" + Productname + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
}
public class problem5 {

	public static void main(String[] args) {
		
		List<Product> list  = new ArrayList<>();
		list.add(new Product(1, "Phone", 1, 100000));
		list.add(new Product(2, "Cemara", 1, 2000000));
		list.add(new Product(3, "Laptop", 5, 500000));
		list.add(new Product(4, "Car", 1, 1000000));
		list.add(new Product(5, "Office", 1, 10000000));
		Collections.sort(list,(p1,p2) -> p1.getPrice()>p2.getPrice()? +1 : -1);
			
		list.forEach(System.out::println);
	}
}
