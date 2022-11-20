
public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress=new Address("line 1", "America", "75019");
		Customer customer=new Customer("Jancy", homeAddress);
		
		Address workAddress=new Address("line2", "Dallas", "75019");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);

	}

}
