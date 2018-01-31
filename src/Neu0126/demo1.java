package Neu0126;

public class demo1 {

	public static void main(String[] args) {
//		Cat cat1=new Cat();
//		cat1.setAge(11);
//		System.out.println(cat1.getAge());
//		
//		cat1.setSex('公');
//		System.out.println(cat1.getSex());
//		
//		cat1.setType("中国猫");
//		System.out.println(cat1.getType());
//		
//		cat1.run();
//	
//		System.out.println(cat1.add(10, 5));
//		System.out.println(cat1.add("nihao", "wu"));
		
//		cat1.jump();
		
		
/*Teacher 抽象类练习*/
		
//		MathT math1=new MathT();
//		math1.teach();
//		math1.study();
//		math1.walk();
//		
//		ChineseT chine1=new ChineseT();
//		chine1.teach();
//		chine1.study();
//		chine1.walk();

		
/*普通方法实现更换cpu时,强耦合练习*/
		
//		Bios bio1=new Bios();
		/*使用I3计算*/
//		I3 i3=new I3();	
//		bio1.setI3(i3);
//		bio1.method();
//		
		/*使用I5计算*/
//		I5 i5=new I5();
//		bio1.setI5(i5);
//		bio1.method();
		
		/*使用I7计算*/
//		I7 i7=new I7();
//		bio1.setI7(i7);
//		bio1.method();

/*使用interface定义CPU接口之后练习*/
		
		Bios bio=new Bios();
/*使用i3进行计算*/		
//		I3 i3=new I3();
//		bio.setCpu(i3);
//		bio.method();
		
/*使用i5进行计算*/
//		I5 i5=new I5();
//		bio.setCpu(i5);
//		bio.method();
		
/*使用i7进行计算*/
		I7 i7=new I7();
		bio.setCpu(i7);
		bio.method();
      
	}

}
