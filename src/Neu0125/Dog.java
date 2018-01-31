package Neu0125;

public class Dog {
	/*创建一个静态的属性*/
	
	public static int number=123;
	
	/*创建一个静态方法*/
	
	public static void fun(){
		System.out.println("静态方法");
		
	}
	
	
	/*原则上属性私有化,方法公开化*/
	
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
	
    /*自定义方法  修饰符 + 数据类型 +方法名*/
	public int add(int a){
		return a;
	}
	//方法重载 参数个数不同
	public int add(int a,int b){
		return a+b;
	}
	//方法重载 参数类型不同
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
