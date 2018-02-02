package Neu0201_Thread_lock;

public class Take implements Runnable{
	private Stock stock;
	public Take(Stock stock){
		this.stock=stock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (stock) {
				if(stock.count>0){
					stock.take();
					System.out.println(Thread.currentThread().getName()+"   "+stock.count);
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
