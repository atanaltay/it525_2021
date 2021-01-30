package example2;

public class Rental<T extends Rentable> {

	T itemToRent;
	
	
	public Rental(T itemToRent) {
		this.itemToRent = itemToRent;
	}
	
	public void processRental() {
		itemToRent.rentOut();
	}
	
	public T getItemToRent() {
		return itemToRent;
	}
	
	public void setItemToRent(T itemToRent) {
		this.itemToRent = itemToRent;
	}
}
