package Neu0126;

public class ChineseT extends Teacher {
	
	/*子类在使用抽象类时,需要重写父类的方法*/
    @Override
	public void teach(){
		System.out.println("我会教语文");
	}
    @Override
	public void study(){
		System.out.println("我学习语文知识在行");
	}
	

}
