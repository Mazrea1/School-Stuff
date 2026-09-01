package MyFirstProject.src.com.stthom.javaapp;

public class Customer extends Person {

	private String id;
	private String pwd;
	private String customerId = id;
	private String customerPassword = pwd;
	
	public Customer() {
	}
	public Customer(String fName, String lName) {
		super(fName, lName);
	}
	public Customer(String fName, String lName, String id, String pwd) {
		super(fName, lName);
		this.customerId = id;
		this.customerPassword = pwd;
	}
	public String getCustomerId() {
	return customerId;
	/}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	
	
}
