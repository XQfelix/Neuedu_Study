package Neu0126;

public class Cat extends Animat {
	/*子类在调用父类含参构造方法的时候需要用super并且在 子类构造方法中传入和父类构造函数同样的参数*/
	public Cat(String name,Integer age,String type,Character sex){
		super(name,age,type,sex);
	}

	public String add(String a,String b){
    	 return a+b;
     }
     
     public void run(){
    	 System.out.println("你快看,我会跑");
     }
}
