package Neu0125;

public class Dog {
	/*����һ����̬������*/
	
	public static int number=123;
	
	/*����һ����̬����*/
	
	public static void fun(){
		System.out.println("��̬����");
		
	}
	
	
	/*ԭ��������˽�л�,����������*/
	
	private String name;
	private int age;
	private char sex;
	private String type;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public char getSex(){
		return sex;
	}
	
	public void setSex(char sex){
		this.sex=sex;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
    /*�Զ��巽��  ���η� + �������� +������*/
	public int add(int a){
		return a;
	}
	//�������� ����������ͬ
	public int add(int a,int b){
		return a+b;
	}
	//�������� �������Ͳ�ͬ
	public float add(float a,float b){
		return a+b;
	}
	
	public void method1(){
		System.out.println("hello world!");
	}
	
	
	
	public static int remove(int a,int b){
		int c=a+b;
		return c;
		
		
	}

	

}
