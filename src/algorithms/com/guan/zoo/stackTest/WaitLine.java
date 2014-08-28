package algorithms.com.guan.zoo.stackTest;


import algorithms.com.guan.algs4.LinkedQueue;

public class WaitLine {
	private LinkedQueue line;
	private int numberOfArrivals;
	private int numberServed;
	private int totalTimeWaited;
	
	public WaitLine(){
		line = new LinkedQueue();
		reset();
	}
	
	/**
	 * ģ��ֻ��һλ�������ĵȴ�����
	 * @param duration	ģ��ʱ�������
	 * @param arrivalProbability	��ָ����ʱ���ڹ˿Ͷ��ĸ��ʣ�Ϊ0��1֮���һ��ʵ��
	 * @param maxServiceTime	Ϊ�ͻ������ʱ������ֵ
	 */
	public void simulate(int duration, double arrivalProbability, int maxServiceTime){
		int serviceTimeLeft = 0;
		for(int clock = 0; clock < duration; clock++){
			if(Math.random() < arrivalProbability){
				numberOfArrivals++;
				int serviceTime = (int)(Math.random()*maxServiceTime + 1);
				Customer nextArrival = new Customer(clock,serviceTime,numberOfArrivals);
				line.enqueue(nextArrival);
				System.out.println("Customer" + numberOfArrivals + "enters line at time" + 
							clock + ".Service time is" + serviceTime);
				
			}
			if(serviceTimeLeft > 0)
				serviceTimeLeft--;
			else if(!line.isEmpty()){
				Customer nextCustomer = (Customer)line.dequeue();
				serviceTimeLeft = nextCustomer.getServiceTime() - 1;
				int timeWaited = clock - nextCustomer.getArrivalTime();
				totalTimeWaited = totalTimeWaited + timeWaited;
				numberServed++;
				System.out.println("Customer" + nextCustomer.getCustomerNumber() + 
						"begins service at time" + clock + ".Time waited is" + timeWaited);
			}
		}
	}

	public void displayResults(){
		System.out.println();
		System.out.println("Number served" + numberServed);
		System.out.println("Total time waited" + totalTimeWaited);
		double averageTimeWaited = ((double)totalTimeWaited)/numberServed;
		System.out.println("Average time waited" + averageTimeWaited);
		int leftInLine = numberOfArrivals - numberServed;
		System.out.println("Number left in line" + leftInLine);
		
	}
	
	private void reset() {
		//line.clear();
		numberOfArrivals = 0;
		numberServed = 0;
		totalTimeWaited = 0;

		
		
	}
	
	public static void main(String args[]){
		WaitLine customerLine = new WaitLine();
		customerLine.simulate(20, 0.5, 5);
		customerLine.displayResults();
	}

}
