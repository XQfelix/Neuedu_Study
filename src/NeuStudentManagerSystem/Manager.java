package NeuStudentManagerSystem;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Manager {
	/*创建一个静态的list用来存放学生的信息,并且实现添加删除修改查询的操作*/
	static ArrayList<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		select(list);

	}
	
	public static void select(ArrayList<Student> list){
/*欢迎界面的输出显示*/
		System.out.println("******************/欢迎使用学生管理系统\\****************");
		System.out.println("****************************************************");
		System.out.println("\\*******\\请选择您要进行的操作:");
		System.out.println("\\1:添加学生信息:");
		System.out.println("\\2:删除学生信息:");
		System.out.println("\\3:修改学生信息:");
		System.out.println("\\4:查询学生信息:");
		System.out.println("请输入对应的编号:");
/*从控制台获取到用户输入的数字*/	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
/*使用swich来实现子选项的选择*/
		switch (num) {
/*case 1 实现学生信息的添加*/
		case 1:
			System.out.println("********************/添加学生信息\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*请输入需要添加的学生的学号:");
            Scanner sid = new Scanner(System.in);
            String  studentid = sid.nextLine();
            System.out.println("\\*请输入需要添加的学生的姓名:");
            Scanner sname = new Scanner(System.in);
            String name = sname.nextLine();
            System.out.println("\\*请输入需要添加的学生的性别:");
            Scanner ssex = new Scanner(System.in);
            String sex = ssex.nextLine();
            System.out.println("\\*请输入需要添加的学生的分数:");
            Scanner sgrade = new Scanner(System.in);
            Integer grade = sgrade.nextInt();
            list.add(new Student(name,studentid,sex,grade));
            System.out.println("\\*添加成功!!");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);		
			break;
/*删除学生信息*/		
		case 2:
			System.out.println("********************/删除学生信息\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*请输入将要删除的学生学号:");
            Scanner DId = new Scanner(System.in);
            String DeleteId = DId.nextLine();
            boolean isfindDelete = false;
            for(int i=0;i<list.size();i++){
            	if(DeleteId.equals(list.get(i).getId())){
            		list.remove(i);
            		System.out.println("删除成功!!");
            		isfindDelete = true;       
            	}
            }
            if(!isfindDelete){
            	System.out.println("删除失败");
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);
            break;
/*修改学生信息*/        
		case 3:
			System.out.println("********************/修改学生信息\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*请输入将要修改的学生学号:");
            Scanner GId = new Scanner(System.in);
            String GstudentId = GId.nextLine();
            boolean isfindChange = false;
            for (int j = 0; j < list.size(); j++) {
                if(GstudentId.equals(list.get(j).getId())){
                    System.out.println("学生原成绩为"+list.get(j).getGrade());
                    System.out.print("请输入修改后学生的成绩：");
                    Scanner Ggrade = new Scanner(System.in);
                    int grade2 = Ggrade.nextInt();
                    list.get(j).setGrade(grade2);
                    System.out.println("修改成功!!!");
                    isfindChange =true;
                }else{
                    
                }
            }
            if(!isfindChange){
                System.out.println("抱歉，没有找到");
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);
            break;
/*查看学生信息*/
		case 4:
            System.out.println("********************/查看学生信息\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*请输入将要查看的学生学号:");
            Scanner searchid = new Scanner(System.in);
            String SearchID = searchid.nextLine();
            boolean isfindSearch = false;
            for(int k=0;k<list.size();k++){
            	if(SearchID.equals(list.get(k).getId())){
            		System.out.println("\\*正在查询:");
            		System.out.println("姓名:"+list.get(k).getName());
            		System.out.println("学号"+list.get(k).getId());
            		System.out.println("性别"+list.get(k).getSex());
            		System.out.println("成绩"+list.get(k).getGrade());
            		isfindSearch = true;
            	}
            }
            if(!isfindSearch){
            	System.out.println("找不到该同学");
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);
            break;
 /*当输入错误的时候显示提示*/           
        default:
        	System.out.println("输入有误,重新输入");
        	break;
            
           
		}
	}

}
