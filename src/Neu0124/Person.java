package Neu0124;

public class Person {
      /*原则:属性私有化  方法公开化*/
	
	private String name;
	private int age;
	private char sex;
	
	
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
	
	public void method(){
		System.out.println("我叫"+name+"我的性别是:"+sex+"我的年龄是:"+age);
	}
	
}
