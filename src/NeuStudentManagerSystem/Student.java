package NeuStudentManagerSystem;

public class Student {
	/*定义学生属性*/
	private String name;
	private String id;
	private String sex;
	private Integer grade;
	
	 public Student(String name,String id,String sex,Integer grade){
	        this.name= name;
	        this.id= id;
	        this.sex = sex;
	        this.grade = grade;    
	    }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
	
}
