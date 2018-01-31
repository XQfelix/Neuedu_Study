package Neu0129;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*复习*/
/*
  数据类型
  	基本类型
  		byte         1      Byte             0
  		short        2      Short            0
  		int          4      Integer          0
  		long         8      Long             0
  		float        4      Float            0.0f
  		double       8      Double           0.0
  		boolean      1      Boolean          false
  		char         2      Character       /u0000
  		在使用int包装类超过-128---127的范围的时候需要解包装,intValue();
  		强制类型转换(int)1.2f;
  	
  	引用类型
  		类----定义类---new---class--文件名和类名必须一致,
  			   属性----  私有的,  用private修饰  并且生成了get和set,
  			   方法 ----  基本等同于函数;
  			   构造器-----创建对象,给私有属赋初始值,,如果不写,默认生成一个无参构造,
  		数组----
  		接口
  			定义接口  new--interface---文件名和接口名必须一致;
  				抽象方法---只有方法的定义,没有方法的具体的实现;
  					不能有成员变量,但是可有有常量(用static  final )
  					作用:约束子类必须要重写的方法
  					
  	内存模型:
  		堆---用new关键词创建出的对象,jkd1.7开始 字符串常量池也在堆中放
  		栈---栈针  没调用一个方法,创建一个栈针,保存临时变量(包含参数)
  		方法区---静态成员   类的信息  jdk1.7之前版本 字符串常量池在方法区中存放;   
        javap -c反汇编命令
                调用方法进行参数传递的时候,基本类型传递的是值,引用类型传递的是内存地址;  					
*/


public class demo1 {
	public static void main(String[] args){
//		/*定义的时候不赋值*/
//		int[] arr=new int[6];
//		arr[0]=6;
//		arr[1]=4;
//		System.out.println(arr[1]);
//		
//		/*定义的时候赋值*/
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
	
		
/*数组*/
/*选择快速排序*/

			
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
		
		
/*冒泡排序*/
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
		
/*ArrayList动态数组*/
		
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
 /*增强for循环遍历*/       
//        for(Object a:list){
//        	System.out.println(a);
//        }
/*一般for循环遍历*/
//        for(int i=0;i<list.size();i++){
//        	System.out.println(list.get(i));
//        }
/*迭代器遍历*/
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

	
/*String字符串*/
/*比较两个字符串的值是不相同*/		
//		 String a1="ab";
//		 String a2="ab";
//		 System.out.println(a1.equals(a2));
		
/*equals() substring() replace() replaceAll()*/
		
//	 StringBuilder string1 = new StringBuilder("adcqweqwe");
//	 StringBuilder string2 = new StringBuilder("edfqwertr");
//
//	  string1.append("haha");                         //使用append()在字符串后面追加内容
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
	  
	  StringBuffer str4 = new StringBuffer("你好啊你叫什么名字呀!");
	  str4.append("我是你爸爸");
	  
	  String str5 = "hello i am mike";
	  String str6 = "hello i am mike";
	  
	  
	  
	  
	  
	  
	  System.out.println(str4);
	  System.out.println(str5);
	  System.out.println(str5.substring(1, 4));                        //substring 截取元素   
	  System.out.println(str5.replace("mike", "jhon"));                //replace 替换元素
	  System.out.println(str5.equals(str6));                           //比较两个数组是不是相同
	  
	  
	  
	  
	 
	
	 

	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



       
		





















