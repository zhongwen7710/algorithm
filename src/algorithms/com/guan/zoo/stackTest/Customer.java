package algorithms.com.guan.zoo.stackTest;

public class Customer {

	private int arrivalTime;
	private int serviceTime;
	private int customerNumber;
	


	public Customer() {
		super();
	}

	public Customer(int arrivalTime, int serviceTime, int customerNumber) {
		super();
		this.arrivalTime = arrivalTime;
		this.serviceTime = serviceTime;
		this.customerNumber = customerNumber;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	


}
