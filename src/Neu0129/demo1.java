package Neu0129;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*��ϰ*/
/*
  ��������
  	��������
  		byte         1      Byte             0
  		short        2      Short            0
  		int          4      Integer          0
  		long         8      Long             0
  		float        4      Float            0.0f
  		double       8      Double           0.0
  		boolean      1      Boolean          false
  		char         2      Character       /u0000
  		��ʹ��int��װ�೬��-128---127�ķ�Χ��ʱ����Ҫ���װ,intValue();
  		ǿ������ת��(int)1.2f;
  	
  	��������
  		��----������---new---class--�ļ�������������һ��,
  			   ����----  ˽�е�,  ��private����  ����������get��set,
  			   ���� ----  ������ͬ�ں���;
  			   ������-----��������,��˽��������ʼֵ,,�����д,Ĭ������һ���޲ι���,
  		����----
  		�ӿ�
  			����ӿ�  new--interface---�ļ����ͽӿ�������һ��;
  				���󷽷�---ֻ�з����Ķ���,û�з����ľ����ʵ��;
  					�����г�Ա����,���ǿ����г���(��static  final )
  					����:Լ���������Ҫ��д�ķ���
  					
  	�ڴ�ģ��:
  		��---��new�ؼ��ʴ������Ķ���,jkd1.7��ʼ �ַ���������Ҳ�ڶ��з�
  		ջ---ջ��  û����һ������,����һ��ջ��,������ʱ����(��������)
  		������---��̬��Ա   �����Ϣ  jdk1.7֮ǰ�汾 �ַ����������ڷ������д��;   
        javap -c���������
                ���÷������в������ݵ�ʱ��,�������ʹ��ݵ���ֵ,�������ʹ��ݵ����ڴ��ַ;  					
*/


public class demo1 {
	public static void main(String[] args){
//		/*�����ʱ�򲻸�ֵ*/
//		int[] arr=new int[6];
//		arr[0]=6;
//		arr[1]=4;
//		System.out.println(arr[1]);
//		
//		/*�����ʱ��ֵ*/
//		int[] arr2={10,1,3,4,5,6,7,8};
//		System.out.println(arr2[2]);
//		
////		for(int i=0;i<arr2.length-1;i++){
////			
////		}
//		
//		for(int i:arr2){
//			System.out.println(i);
//		}
//		
//		for(int i:arr){
//			System.out.println(i);
//		}
//		
	
		
/*����*/
/*ѡ���������*/

			
//	int[] arr={3,7,1,8,5,11,6};
//	for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//			if(arr[i]>arr[j]){
//				int btm=arr[i];
//				arr[i]=arr[j];
//				arr[j]=btm;
//			}			
//		}	
//	}	
//	
//	for(int b:arr){
//		System.out.print(b+"  ");
//	}
		
		
/*ð������*/
//		
//		int[] arr={3,7,1,8,5,11,6};
//		for(int i=0;i<arr.length-1;i++){
//			for(int j=0;j<arr.length-i-1;j++){
//				if(arr[j]>arr[j+1]){
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}	
//			}	
//		}
//		
//		for(int b:arr){
//			System.out.print(b+"  ");
//		}		
		
/*ArrayList��̬����*/
		
//		List <String> lt=new ArrayList();
//		
//		lt.add("hello");
//		lt.add("5");
//		lt.add("3");
//		lt.add("hi");
//		lt.add("word");
//
//        for(String b:lt){
//        	System.out.println(b);
//        }
//        
//        for(int i=0;i<lt.size();i++){
//        	System.out.println(lt.get(i));
//        }
        
        
     
        
//		List list= new ArrayList(); 
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.remove(0);
 /*��ǿforѭ������*/       
//        for(Object a:list){
//        	System.out.println(a);
//        }
/*һ��forѭ������*/
//        for(int i=0;i<list.size();i++){
//        	System.out.println(list.get(i));
//        }
/*����������*/
//      Iterator  lis = list.iterator();
//      while(lis.hasNext()){
//    	  System.out.println(lis.next());
//      }
  
/*HashSet()*/
//		Set hash = new HashSet();
//		hash.add(2);
//		hash.add(5);
//		hash.add(6);		
//		hash.remove(2);
//		
//		for(Object b:hash){
//			System.out.println(b);
//		}
		
/*HashMap()*/
//		HashMap map = new HashMap();
//		map.put(0, "a");
//		map.put(1, "b");
//		map.put(2, "c");
//		map.put(3, "d");
//		System.out.println(map.get(0));
//		System.out.println(map.containsKey(3));
//		System.out.println(map.containsValue("d"));  

	
/*String�ַ���*/
/*�Ƚ������ַ�����ֵ�ǲ���ͬ*/		
//		 String a1="ab";
//		 String a2="ab";
//		 System.out.println(a1.equals(a2));
		
/*equals() substring() replace() replaceAll()*/
		
//	 StringBuilder string1 = new StringBuilder("adcqweqwe");
//	 StringBuilder string2 = new StringBuilder("edfqwertr");
//
//	  string1.append("haha");                         //ʹ��append()���ַ�������׷������
//	  string1.replace(0, 3, "h");
//	 
//	  String hi=string1.substring(3,6);
//	  
//	  String str = "asdffsdf";
//	  String st=  str.replace("a","b");
//	  String str3 = str.replaceAll("f","h");
//	  
//	  System.out.println(string1);
//	  System.out.println(string2);
//	  System.out.println(hi);
//	  System.out.println(str);
//	  System.out.println(st);
//	  System.out.println(str3);
	  
	  StringBuffer str4 = new StringBuffer("��ð����ʲô����ѽ!");
	  str4.append("������ְ�");
	  
	  String str5 = "hello i am mike";
	  String str6 = "hello i am mike";
	  
	  
	  
	  
	  
	  
	  System.out.println(str4);
	  System.out.println(str5);
	  System.out.println(str5.substring(1, 4));                        //substring ��ȡԪ��   
	  System.out.println(str5.replace("mike", "jhon"));                //replace �滻Ԫ��
	  System.out.println(str5.equals(str6));                           //�Ƚ����������ǲ�����ͬ
	  
	  
	  
	  
	 
	
	 

	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



       
		





















