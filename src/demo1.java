
public class demo1 {
	public static void main(String[] args){
		
/*����ƽ������*/
//		int a=2000;
//		
//		if((a%4==0 && a%100!=0)||a%400==0){
//			
//			System.out.println("����");
//		}else{
//			System.out.println("ƽ��");
		
//		}
		
//		
//		
		
/*����20�Ľ׳�*/
//		
//		long b=1;
//		
//		for(int i=1;i<=20;i++){
//			 b=b*i;
//			System.out.println(b);		
//		}
		
		
		
		
/*����1--100������*/
		
		

//        for (int i = 2; i <= 100; i++) { 
//            for (int k = 2; k <= i; k++) { 
//                // �ų������� i=k ֮ǰ �ܱ�k����(����Ϊ0)����
//                if (i % k == 0 && i != k) {
//                    break;
//                }
//                // ��������� i=k �� i%k=0����
//                if (i % k == 0 && i == k) {
//                     System.out.println(i);  
//                    
//                   
//                }
//            }
//        }
		
		
/*��ӡ99�˷���*/
		
//		 for (int n=1;n<=9;n++) {
//
//		        for (int m=1;m<=n;m++) {
//
//		            int b=m*n;
//		            
//		       System.out.print(m+"��"+n+"="+b+" ");
//		        }
//		       System.out.println(" ");
//	}
		
		
		
/*ʹ����򽻻�  ab  ��ֵ*/
//		  int a=10;
//		  int b=5;
//		      a=a^b;
//		      b=a^b;
//		      a=a^b;
//	  
//		    System.out.println(a);
//		    System.out.println(b);
//		
		
		
		
/*ʹ��ð������*/

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
		
		
		
		
/*ʹ��ѡ���������������*/
	
 
//		int[] arr={7,3,8,9,15};
//            for (int i = 0; i < arr.length-1; i++) {
//                for (int j = i+1; j < arr.length; j++) {
//                    if(arr[j]<arr[i]){                         //���������ð����������;
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
		
            
/*�ж�һ��5λ��,�ǲ��ǻ�����,����12321*/
//		int m=12312;
//	    int a=m/10000;                 //������λ����
//	    int b=(m%10000)/1000;          //����ǧλ����
//	    int c=(m%1000)/100;            //�����λ����
//	    int d=(m%100)/10;              //����ʮλ����
//	    int e=m%10;					   //�����λ����
//	    if(a==e&&b==d){
//	      System.out.println("�ǻ�����");
//	    }else{
//	    	System.out.println("���ǻ�����");
//	    }
//	    
		
		
/*����һ����ֵ,�����������,������ֵ,����2349���94321*/
//		int m=2349;
//		int a=m/1000;                   //����ǧλ����
//		int b=(m%1000)/100;             //�����λ����
//		int c=(m%100)/10;               //����ʮλ����
//		int d=m%10;                     //�����λ����
//		
//		System.out.println("ԭ����ֵΪ:"+m);
//		System.out.println("ת����:"+d+c+b+a);
	
		
		
/*���ˮ�ɻ���*/
//		for(int i=100;i<1000;i++){             
//				int a=i/100;                 //��ȡ��λ����
//				int b=(i%100)/10;            //��ȡʮλ����
//				int c=i%10;					 //��ȡ��λ����
//				int e=a*a*a;                 //��ȡ��λ���ֵ�����
//				int d=b*b*b;                 //��ȡʮλ���ֵ�����
//				int f=c*c*c;                 //��ȡ��λ���ֵ�����
//				int g=e+d+f;                 //��ȡˮ�ɻ���
//			 if(g==i){
//				 System.out.println(i);       //���ˮ�ɻ���
//			 }   
//		}
		
		
		
/*�������������Լ������С������,ʹ��շת�����,�����ж�������֮��Ĵ���,��С���������ߵ������ٴ�ȡ��,ֱ��ȡ�ý�С����Ϊ
 * 0��ʱ��,��ʱ�ϴ�����ֱ������Լ��.��С������Ϊ �����������������ٳ������Լ����ó���С������*/
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
		
		
		
/*���һ��������*/
//		for(int i=0;i<10;i++){
//			for(int j=0;j<=8-i;j++){                        //�ڷ��÷���֮ǰ��ÿһ�еĿո���
//				System.out.print(" ");
//			}
//			
//			for(int k=0;k<=i;k++){
//				System.out.print("* "); 					//����ÿһ�е�*�Ÿ���
//			}
//			System.out.println(" ");                    //��ÿһ�з���֮����
//		}
		
/*  ��1234���ĸ���������ɶ��ٸ���λ��(���ظ�)  */
//		    int m=0;
//		    int count=0;
//			int [] arr = {1,2,3,4};
//			for(int i=0;i<arr.length;i++){                                      //��һ��ѭ��ѡ����λ��
//				int a = arr[i];
//					for(int j = 0;j<arr.length;j++){                            //�ڶ���ѡ��ʮλ����
//						if(i!=j){
//							int b = arr[j];
//								for(int k=0;k<arr.length;k++){                  //������ѡ����λ����
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
