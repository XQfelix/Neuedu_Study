package Neu0130;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args){
	/*
StringBuilder                ���̰߳�ȫ,���߳�ƴ�ӵ�ʱ��ʹ��
StringBuffer                 �̰߳�ȫ,���߳�ƴ�ӵ�ʱ��ʹ��
substring                    ��ȡһ��
equals                       �Ƚ��ַ����ǲ�����ͬ
append                       ���ַ���β��׷���ַ�

*/
	

	
/*Scannerɨ�����Ķ����ʹ��*/	
//		Scanner scanner = new Scanner(System.in);
//		int str = scanner.nextInt();
//		System.out.println("���յ���������:"+str);
//		String str1 = scanner.next();
//		System.out.println("���յ���������:"+str1);
//		String str2 = scanner.nextLine();
//		System.out.println("���յ���������"+str2);
		
/*���ͼ���:�涨���������͵ļ���,����ʹ�ð�װ��*/
		
//		Cat <Integer> cat = new Cat<Integer>();
//		cat.add(2);
//		
//		Cat <String> cat1 = new Cat<String>();
//		cat1.add("hao");
		
//		String str = "123456";
				
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(scanner.nextLine());
//		System.out.println("");
		
/*���̺��߳�*/
	    Thread t1 = new Thread1();
	    Thread t2 = new Thread2();
	    
	    
		
	    Runnable r = new Thread3();
	    Thread t3 = new Thread(r);
	    
	    t1.start();
	    t2.start();
	    t3.start();
		
	}
}
