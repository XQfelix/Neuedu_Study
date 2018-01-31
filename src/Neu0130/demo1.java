package Neu0130;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args){
	/*
StringBuilder                非线程安全,单线程拼接的时候使用
StringBuffer                 线程安全,多线程拼接的时候使用
substring                    截取一段
equals                       比较字符串是不是相同
append                       在字符串尾部追加字符

*/
	

	
/*Scanner扫描器的定义和使用*/	
//		Scanner scanner = new Scanner(System.in);
//		int str = scanner.nextInt();
//		System.out.println("接收到的数字是:"+str);
//		String str1 = scanner.next();
//		System.out.println("接收到的文字是:"+str1);
//		String str2 = scanner.nextLine();
//		System.out.println("接收到的文字是"+str2);
		
/*泛型集合:规定了数据类型的集合,可以使用包装类*/
		
//		Cat <Integer> cat = new Cat<Integer>();
//		cat.add(2);
//		
//		Cat <String> cat1 = new Cat<String>();
//		cat1.add("hao");
		
//		String str = "123456";
				
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(scanner.nextLine());
//		System.out.println("");
		
/*进程和线程*/
	    Thread t1 = new Thread1();
	    Thread t2 = new Thread2();
	    
	    
		
	    Runnable r = new Thread3();
	    Thread t3 = new Thread(r);
	    
	    t1.start();
	    t2.start();
	    t3.start();
		
	}
}
