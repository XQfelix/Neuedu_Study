package Neu0125;

public class demo1 {
	
	public static void remo(){
		System.out.println("本类中添加静态方法");
	}
	
	
	public static void main(String[] agrs){
		
/*创建一个cat1和cat2对象练习*/
		
//		Cat cat1=new Cat();
//		cat1.setName("二胖");
//		cat1.setAge(6);
//		cat1.setSex('男');
//		cat1.setType("波斯猫");
//		
//		System.out.println(cat1.getName());
//		System.out.println(cat1.getAge());
//		System.out.println(cat1.getSex());
//		System.out.println(cat1.getType());	
//		cat1.run();
//		cat1.jump();
//		
//		
//		Cat cat2= new Cat();
//		cat2.setName("三胖");
//		cat2.setAge(10);
//		cat2.setSex('女');
//		cat2.setType("野猫");
//		
//		System.out.println(cat2.getName());
//		System.out.println(cat2.getAge());
//		System.out.println(cat2.getSex());
//		System.out.println(cat2.getType());
//		cat2.run();
		
		
/*方法的重载练习,参数个数不同,类型不同,顺序不同*/	
		
//		Cat cat=new Cat();
//		cat.jump();
//		int a=cat.add(3);
//		int b=cat.add(2, 3);
//		float c=cat.add(2.3f, 1.1f);
//		int d=cat.add("nihao", 2);
//		
//		System.out.println(Cat.a);               //调用静态方法,直接输出 a的值;
//
//		cat.method(6, 10);
//		
//		
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		
		
		
/*new一个Dog对象*/
		Dog dog1=new Dog();
		dog1.setName("felix");
		dog1.setAge(12);
		dog1.setSex('女');
		dog1.setType("二哈");
		
		String a=dog1.getName();
		System.out.println(a);
		System.out.println(dog1.getName());
		System.out.println(dog1.getAge());
		System.out.println(dog1.getSex());
		System.out.println(dog1.getType());
		System.out.println(Dog.number);        //静态属性
		Dog.fun();                            //    调用静态方法    类名  .  方法名
		remo();                               //本类中调用静态方法
		
		
		
		/*car接口练习*/
		People car1=new People();
		People car2=new People();
		People car3=new People();
		Bentian Bt=new Bentian();
		car1.setCar(Bt);
		car1.method(Bt);
		
		Bwm Bw=new Bwm();
		car2.setCar(Bw);
		car2.method(Bw);
		
		Benchi Bc=new Benchi();
		car3.setCar(Bc);
		car3.method(Bc);
		
	}
}
