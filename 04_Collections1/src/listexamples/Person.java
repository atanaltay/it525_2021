package listexamples;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private List<Address> addresses;
	
	public Person() {
		addresses = new ArrayList<Address>();
	}
	
	
	public void addAddress(Address address) {
		this.addresses.add(address);
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
}
