package Neu0126;

public class Cat extends Animat {
	/*�����ڵ��ø��ຬ�ι��췽����ʱ����Ҫ��super������ ���๹�췽���д���͸��๹�캯��ͬ���Ĳ���*/
	public Cat(String name,Integer age,String type,Character sex){
		super(name,age,type,sex);
	}

	public String add(String a,String b){
    	 return a+b;
     }
     
     public void run(){
    	 System.out.println("��쿴,�һ���");
     }
}
