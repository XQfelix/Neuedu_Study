package NeuStudentManagerSystem;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Manager {
	/*����һ����̬��list�������ѧ������Ϣ,����ʵ�����ɾ���޸Ĳ�ѯ�Ĳ���*/
	static ArrayList<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		select(list);

	}
	
	public static void select(ArrayList<Student> list){
/*��ӭ����������ʾ*/
		System.out.println("******************/��ӭʹ��ѧ������ϵͳ\\****************");
		System.out.println("****************************************************");
		System.out.println("\\*******\\��ѡ����Ҫ���еĲ���:");
		System.out.println("\\1:���ѧ����Ϣ:");
		System.out.println("\\2:ɾ��ѧ����Ϣ:");
		System.out.println("\\3:�޸�ѧ����Ϣ:");
		System.out.println("\\4:��ѯѧ����Ϣ:");
		System.out.println("�������Ӧ�ı��:");
/*�ӿ���̨��ȡ���û����������*/	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
/*ʹ��swich��ʵ����ѡ���ѡ��*/
		switch (num) {
/*case 1 ʵ��ѧ����Ϣ�����*/
		case 1:
			System.out.println("********************/���ѧ����Ϣ\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*��������Ҫ��ӵ�ѧ����ѧ��:");
            Scanner sid = new Scanner(System.in);
            String  studentid = sid.nextLine();
            System.out.println("\\*��������Ҫ��ӵ�ѧ��������:");
            Scanner sname = new Scanner(System.in);
            String name = sname.nextLine();
            System.out.println("\\*��������Ҫ��ӵ�ѧ�����Ա�:");
            Scanner ssex = new Scanner(System.in);
            String sex = ssex.nextLine();
            System.out.println("\\*��������Ҫ��ӵ�ѧ���ķ���:");
            Scanner sgrade = new Scanner(System.in);
            Integer grade = sgrade.nextInt();
            list.add(new Student(name,studentid,sex,grade));
            System.out.println("\\*��ӳɹ�!!");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);		
			break;
/*ɾ��ѧ����Ϣ*/		
		case 2:
			System.out.println("********************/ɾ��ѧ����Ϣ\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*�����뽫Ҫɾ����ѧ��ѧ��:");
            Scanner DId = new Scanner(System.in);
            String DeleteId = DId.nextLine();
            boolean isfindDelete = false;
            for(int i=0;i<list.size();i++){
            	if(DeleteId.equals(list.get(i).getId())){
            		list.remove(i);
            		System.out.println("ɾ���ɹ�!!");
            		isfindDelete = true;       
            	}
            }
            if(!isfindDelete){
            	System.out.println("ɾ��ʧ��");
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);
            break;
/*�޸�ѧ����Ϣ*/        
		case 3:
			System.out.println("********************/�޸�ѧ����Ϣ\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*�����뽫Ҫ�޸ĵ�ѧ��ѧ��:");
            Scanner GId = new Scanner(System.in);
            String GstudentId = GId.nextLine();
            boolean isfindChange = false;
            for (int j = 0; j < list.size(); j++) {
                if(GstudentId.equals(list.get(j).getId())){
                    System.out.println("ѧ��ԭ�ɼ�Ϊ"+list.get(j).getGrade());
                    System.out.print("�������޸ĺ�ѧ���ĳɼ���");
                    Scanner Ggrade = new Scanner(System.in);
                    int grade2 = Ggrade.nextInt();
                    list.get(j).setGrade(grade2);
                    System.out.println("�޸ĳɹ�!!!");
                    isfindChange =true;
                }else{
                    
                }
            }
            if(!isfindChange){
                System.out.println("��Ǹ��û���ҵ�");
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);
            break;
/*�鿴ѧ����Ϣ*/
		case 4:
            System.out.println("********************/�鿴ѧ����Ϣ\\********************");
			System.out.println("****************************************************");
            System.out.println("\\*�����뽫Ҫ�鿴��ѧ��ѧ��:");
            Scanner searchid = new Scanner(System.in);
            String SearchID = searchid.nextLine();
            boolean isfindSearch = false;
            for(int k=0;k<list.size();k++){
            	if(SearchID.equals(list.get(k).getId())){
            		System.out.println("\\*���ڲ�ѯ:");
            		System.out.println("����:"+list.get(k).getName());
            		System.out.println("ѧ��"+list.get(k).getId());
            		System.out.println("�Ա�"+list.get(k).getSex());
            		System.out.println("�ɼ�"+list.get(k).getGrade());
            		isfindSearch = true;
            	}
            }
            if(!isfindSearch){
            	System.out.println("�Ҳ�����ͬѧ");
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            select(list);
            break;
 /*����������ʱ����ʾ��ʾ*/           
        default:
        	System.out.println("��������,��������");
        	break;
            
           
		}
	}

}
