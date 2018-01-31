
public class demo1 {
	public static void main(String[] args){
		
/*计算平年闰年*/
//		int a=2000;
//		
//		if((a%4==0 && a%100!=0)||a%400==0){
//			
//			System.out.println("闰年");
//		}else{
//			System.out.println("平年");
		
//		}
		
//		
//		
		
/*计算20的阶乘*/
//		
//		long b=1;
//		
//		for(int i=1;i<=20;i++){
//			 b=b*i;
//			System.out.println(b);		
//		}
		
		
		
		
/*计算1--100的质数*/
		
		

//        for (int i = 2; i <= 100; i++) { 
//            for (int k = 2; k <= i; k++) { 
//                // 排除所有在 i=k 之前 能被k整除(余数为0)的数
//                if (i % k == 0 && i != k) {
//                    break;
//                }
//                // 输出所有在 i=k 且 i%k=0的数
//                if (i % k == 0 && i == k) {
//                     System.out.println(i);  
//                    
//                   
//                }
//            }
//        }
		
		
/*打印99乘法表*/
		
//		 for (int n=1;n<=9;n++) {
//
//		        for (int m=1;m<=n;m++) {
//
//		            int b=m*n;
//		            
//		       System.out.print(m+"×"+n+"="+b+" ");
//		        }
//		       System.out.println(" ");
//	}
		
		
		
/*使用异或交换  ab  的值*/
//		  int a=10;
//		  int b=5;
//		      a=a^b;
//		      b=a^b;
//		      a=a^b;
//	  
//		    System.out.println(a);
//		    System.out.println(b);
//		
		
		
		
/*使用冒泡排序*/

//		  int[] a={5,14,22,30};
//		for(int i=0;i<a.length-1;i++){
//	      for(int j=0;j<a.length-1-i;j++){
//	    	  if(a[j]<a[j+1]){
//	    		  int imp=a[j];
//	    		  a[j]=a[j+1];
//	    		  a[j+1]=imp;
//	    	  }	    	 
//	    	  }
//	      for(int b:a){
//    		  System.out.print(b+",");  
//	      }
//	      System.out.println();   
//		}
		
		
		
		
/*使用选择排序对数组排序*/
	
 
//		int[] arr={7,3,8,9,15};
//            for (int i = 0; i < arr.length-1; i++) {
//                for (int j = i+1; j < arr.length; j++) {
//                    if(arr[j]<arr[i]){                         //快速排序和冒泡排序区别;
//                        int temp=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//         
//            } for(int b:arr){
//        		  System.out.print(b+",");
//            }
//            
		
            
/*判断一个5位数,是不是回文数,例如12321*/
//		int m=12312;
//	    int a=m/10000;                 //计算万位数字
//	    int b=(m%10000)/1000;          //计算千位数字
//	    int c=(m%1000)/100;            //计算百位数字
//	    int d=(m%100)/10;              //计算十位数字
//	    int e=m%10;					   //计算个位数字
//	    if(a==e&&b==d){
//	      System.out.println("是回文数");
//	    }else{
//	    	System.out.println("不是回文数");
//	    }
//	    
		
		
/*输入一个数值,输出他的逆数,输入数值,例如2349输出94321*/
//		int m=2349;
//		int a=m/1000;                   //计算千位数字
//		int b=(m%1000)/100;             //计算百位数字
//		int c=(m%100)/10;               //计算十位数字
//		int d=m%10;                     //计算个位数字
//		
//		System.out.println("原来数值为:"+m);
//		System.out.println("转换后:"+d+c+b+a);
	
		
		
/*输出水仙花数*/
//		for(int i=100;i<1000;i++){             
//				int a=i/100;                 //获取百位数字
//				int b=(i%100)/10;            //获取十位数字
//				int c=i%10;					 //获取个位数字
//				int e=a*a*a;                 //获取百位数字的立方
//				int d=b*b*b;                 //获取十位数字的立方
//				int f=c*c*c;                 //获取个位数字的立方
//				int g=e+d+f;                 //获取水仙花数
//			 if(g==i){
//				 System.out.println(i);       //输出水仙花数
//			 }   
//		}
		
		
		
/*求两个数的最大公约数和最小公倍数,使用辗转相除法,首先判断两个数之间的大数,用小的数与两者的余数再次取余,直到取得较小的数为
 * 0的时候,此时较大的数字便是最大公约数.最小公倍数为 用最初的两个数相乘再除以最大公约数便得出最小公倍数*/
//		int a=4;
//		int i=a;
//		int b=6;
//		int j=b;
//		int x=0,y=0;
//		
//		if(a<b){
//			x=b;
//			b=a;
//			a=x;
//		}
//		while(b!=0){
//			y=a%b;
//			a=b;
//			b=y;
//		}
//		int t=i*j/a;
//		System.out.println(a);
//		System.out.println(t);
//		
		
		
		
/*输出一个三角形*/
//		for(int i=0;i<10;i++){
//			for(int j=0;j<=8-i;j++){                        //在放置符号之前的每一行的空格数
//				System.out.print(" ");
//			}
//			
//			for(int k=0;k<=i;k++){
//				System.out.print("* "); 					//计算每一行的*号个数
//			}
//			System.out.println(" ");                    //在每一行放完之后换行
//		}
		
/*  由1234这四个数字能组成多少个三位数(不重复)  */
//		    int m=0;
//		    int count=0;
//			int [] arr = {1,2,3,4};
//			for(int i=0;i<arr.length;i++){                                      //第一遍循环选出百位数
//				int a = arr[i];
//					for(int j = 0;j<arr.length;j++){                            //第二层选出十位数字
//						if(i!=j){
//							int b = arr[j];
//								for(int k=0;k<arr.length;k++){                  //第三层选出个位数字
//									if(k!=i&&k!=j){
//										int c = arr[k];	
//
//									     m=a*100+b*10+c;
//									     System.out.println(m);
//									     count++;
//									}
//								}	
//								
//						    }
//				    	}
//			}
//			System.out.println(count);
		
		
          
            
      
 
		
		  
		  
			
		
		
		
		    
		    
		    
		    
		    
		    
		  
		
	
}
}
