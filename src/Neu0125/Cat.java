package Neu0125;

public class Cat {

	public static int a=10;                           /*����һ����̬�Ĺ���������*/
	 
     private String name;
     private int age;
     private char sex;
     private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void run(){
		System.out.println("���ǿ�����,�һ���!!!");
	}
	
	public void jump(){
		System.out.println(name+"�һ���Ծ!!");
	}
	
	
	
	/*��������,  ��������ͬ ������ͬ*/
	
	public int add(int a){
		return a;
	}
	
	public int add(int a,int b){
		return a+b;
	}
	
	/*��������ͬ,�������Ͳ�ͬ*/
	public float add(float a,float b){
		return a+b;
	}
	
	/*�������͵�˳��ͬ*/
	
	public int add(String b,int a){
		return a;
	}
	
	
	
	
	public void method(int a,int b){
		System.out.println("ԭ��Ϊ:"+a+" "+b);
		int i=a;	
		int j=b;
		int x=0,y=0;
		
		if(a<b){
			x=b;
			b=a;
			a=x;
		}
		while(b!=0){
			y=a%b;
			a=b;
			b=y;
		}
		int t=i*j/a;
		System.out.println("���Լ��Ϊ:"+a);
		System.out.println("��С������Ϊ:"+t);
	
	}
     
     
}
