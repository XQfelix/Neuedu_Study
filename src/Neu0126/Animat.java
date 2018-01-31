package Neu0126;

public class Animat {
	public Animat(){}                      //默认无参构造方法
	public Animat(String name,Integer age,String type,Character sex){            //含参构造方法
		
		this.name=name;
		this.age=age;
		this.type=type;
		this.sex=sex;
		
	}
	
    private String name;
    private Integer age;
    private String type;
    private Character sex;
    
    private String getName(){
    	return name;
    }
    
    private void setName(String name){
    	this.name=name;
    }

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}
	
	public void run(){
		System.out.println("走路");
	}
	
	private void jump(){
		System.out.println("跳跃");
	}
	
	
	public int add(int a,int b){
		return a+b;
	}
    
    
}
