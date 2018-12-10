package entity;

public class Entities {
	 public String customerName=new String();
	public long phoneNumber;
	public String customerMail=new String();
	public String address=new String();
	public String workingPlace=new String();
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerMail() {
		return customerMail;
	}
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWorkingPlace() {
		return workingPlace;
	}
	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}
	public void display()
	{
		System.out.println("ABOUT CAPGEMINI PG");
		System.out.println("-------------------------");
		System.out.println("2,3,4 Sharing rooms(AC/non AC) are available");
		System.out.println("3 times food(north/south");
		System.out.println("wifi connection");
		System.out.println("LED TV,Washing machine,CCTV Camera");
	}
	public void customerDetails()
	{
		
	}

}
