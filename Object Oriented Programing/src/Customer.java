
public class Customer {
	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	
	//creation
	
	public Customer(String name, Address homeAddress) {
		this.name=name;
		this.homeAddress=homeAddress;
	}


	
	//operation
	public Address getHomeAdress() {
		return homeAddress;
	}


	public void setHomeAdress(Address homeAdress) {
		this.homeAddress = homeAdress;
	}


	public Address getWorkAddress() {
		return workAddress;
	}


	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name - [%s],  home address- [%s], work address-[%s]" , name, homeAddress, workAddress);
	}
	
	
}
