package Neu0131;
/*ʵ��Runnable�ӿ�*/
public class Ticket2 implements Runnable {
	int count = 20;
	Object lock = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub					
			while(count>0){		
				synchronized (lock) {							
					System.out.println(Thread.currentThread().getName()+"������"+count+"��");	
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
