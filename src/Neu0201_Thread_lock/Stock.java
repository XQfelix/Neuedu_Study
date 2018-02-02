package Neu0201_Thread_lock;

public class Stock {
	int count  = 1;
	
	public void put(){
		count++;
	}
	
	public void take(){
		count--;
	}
}
