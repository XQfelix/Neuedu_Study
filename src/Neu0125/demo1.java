package Neu0125;

public class demo1 {
	
	public static void remo(){
		System.out.println("��������Ӿ�̬����");
	}
	
	
	public static void main(String[] agrs){
		
/*����һ��cat1��cat2������ϰ*/
		
//		Cat cat1=new Cat();
//		cat1.setName("����");
//		cat1.setAge(6);
//		cat1.setSex('��');
//		cat1.setType("��˹è");
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
//		cat2.setName("����");
//		cat2.setAge(10);
//		cat2.setSex('Ů');
//		cat2.setType("Ұè");
//		
//		System.out.println(cat2.getName());
//		System.out.println(cat2.getAge());
//		System.out.println(cat2.getSex());
//		System.out.println(cat2.getType());
//		cat2.run();
		
		
/*������������ϰ,����������ͬ,���Ͳ�ͬ,˳��ͬ*/	
		
//		Cat cat=new Cat();
//		cat.jump();
//		int a=cat.add(3);
//		int b=cat.add(2, 3);
//		float c=cat.add(2.3f, 1.1f);
//		int d=cat.add("nihao", 2);
//		
//		System.out.println(Cat.a);               //���þ�̬����,ֱ����� a��ֵ;
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
		
		
/*newһ��Dog����*/
		Dog dog1=new Dog();
		dog1.setName("felix");
		dog1.setAge(12);
		dog1.setSex('Ů');
		dog1.setType("����");
		
		String a=dog1.getName();
		System.out.println(a);
		System.out.println(dog1.getName());
		System.out.println(dog1.getAge());
		System.out.println(dog1.getSex());
		System.out.println(dog1.getType());
		System.out.println(Dog.number);        //��̬����
		Dog.fun();                            //    ���þ�̬����    ����  .  ������
		remo();                               //�����е��þ�̬����
		
		
		
		/*car�ӿ���ϰ*/
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
