package Neu0201_Thread_lock;

public class Put implements Runnable{
	private Stock stock;
	public Put(Stock stock){
		this.stock=stock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (stock) {
				if(stock.count<1){
					stock.put();
					System.out.println(Thread.currentThread().getName()+"  "+stock.count);
					stock.notify();
				}else{
					try {
						stock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}	
	}

}
