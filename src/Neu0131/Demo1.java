package Neu0131;

public class Demo1 {
    public static void main(String[] args){
    	
/*继承Thread线程*/    	
//    	Thread t1 = new Ticket();
//    	Thread t2 = new Ticket();
//    	t1.start();
//    	t2.start();
    	
/*实现runnable方法*/
    	Runnable ticket= new Ticket2();
    	Thread t3 = new Thread(ticket);
    	Thread t4 = new Thread(ticket);
    	t3.start();
    	t4.start();
	
    }
}
