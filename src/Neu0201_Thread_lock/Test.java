package Neu0201_Thread_lock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		Put put = new Put(stock);
		Take take = new Take(stock);
		Thread t1 = new Thread(put);
		Thread t2 = new Thread(take);
		Thread t3 = new Thread(take);
		t1.start();
		t2.start();
		t3.start();
	}

}
