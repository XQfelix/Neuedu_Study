package Neu0124;

public class Person {
      /*ԭ��:����˽�л�  ����������*/
	
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
		System.out.println("�ҽ�"+name+"�ҵ��Ա���:"+sex+"�ҵ�������:"+age);
	}
	
}
