package Neu0131;
/*实现Runnable接口*/
public class Ticket2 implements Runnable {
	int count = 20;
	Object lock = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub					
			while(count>0){		
				synchronized (lock) {							
					System.out.println(Thread.currentThread().getName()+"卖出了"+count+"张");	
					count--;
						try {
							Thread.currentThread().sleep(1000);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						    }
					  }
			  
				 }
			}

	}
