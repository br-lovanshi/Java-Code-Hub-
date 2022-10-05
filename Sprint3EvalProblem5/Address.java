package Sprint3EvalProblem5;

import java.io.Serializable;

public class Address implements Serializable {

	private String state,city,prinCode;

	public Address(String state, String city, String prinCode) {
		super();
		this.state = state;
		this.city = city;
		this.prinCode = prinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPrinCode() {
		return prinCode;
	}

	public void setPrinCode(String prinCode) {
		this.prinCode = prinCode;
	}
//
//	@Override
//	public String toString() {
//		return "Address [state=" + state + ", city=" + city + ", prinCode=" + prinCode + "]";
//	}
	
	
}
