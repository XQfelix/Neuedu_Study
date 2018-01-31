package Neu0126;

public abstract class Teacher {
/*抽象类中可以没有抽象方法,但是一旦有抽象方法,该类必须声明为抽象类*/
	
	public Teacher(){
		
	}
	
	
	public abstract void teach();
	public abstract void study();
	
	public void walk(){
		System.out.println("我们都会开汽车");
	}
}
