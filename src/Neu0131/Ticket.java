package Neu0131;
/*�̳�Thread*/
public class Ticket extends Thread {
	int count = 20;
     @Override
    public void run() {
    
    	// TODO Auto-generated method stub
    	while(count>0){
    		System.out.println(getName()+"������"+(count--)+"��");
    		try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
