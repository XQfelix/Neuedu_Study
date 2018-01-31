package Neu0130;

public class Thread2 extends Thread {
	public void run(){
		
		
		for(int i=0;i<10;i++){
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("ºÈ¾Æ"+i+"¿Ú!");
		}
	}
}
