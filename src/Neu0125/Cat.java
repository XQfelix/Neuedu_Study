package Neu0125;

public class Cat {

	public static int a=10;                           /*创建一个静态的公共的属性*/
	 
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
		System.out.println("你们快来看,我会跑!!!");
	}
	
	public void jump(){
		System.out.println(name+"我会跳跃!!");
	}
	
	
	
	/*方法重载,  参数名相同 个数不同*/
	
	public int add(int a){
		return a;
	}
	
	public int add(int a,int b){
		return a+b;
	}
	
	/*参数名相同,但是类型不同*/
	public float add(float a,float b){
		return a+b;
	}
	
	/*参数类型的顺序不同*/
	
	public int add(String b,int a){
		return a;
	}
	
	
	
	
	public void method(int a,int b){
		System.out.println("原数为:"+a+" "+b);
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
		System.out.println("最大公约数为:"+a);
		System.out.println("最小公倍数为:"+t);
	
	}
     
     
}
