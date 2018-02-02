package NeuBankSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BanSystem {
	
	static ArrayList<Bank> BankSys= new ArrayList<Bank>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSelect(BankSys);
	}
	
	public static void BankSelect(ArrayList<Bank> BankSys){
/*��ӭ����������ʾ*/
		System.out.println("******************/��ӭʹ�����й���ϵͳ\\****************");
		System.out.println("****************************************************");
		System.out.println("\\*******\\��ѡ����Ҫ���еĲ���:");
		System.out.println("\\1:����:");
		System.out.println("\\2:��Ǯ:");
		System.out.println("\\3:ȡǮ:");
		System.out.println("\\4:�˻���Ϣ:");
		System.out.println("\\5:�ر�ϵͳ");
		System.out.println("�������Ӧ�ı��:");
		
/*�ӿ���̨�������������*/
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		switch (num) {
/*�½�һ���˻�*/
		case 1:
			System.out.println("*******************************/����ʱ��Ϊ:"+hour+"ʱ"+min+"��"+sec+"��/");
			System.out.println("**************************/����\\*********************");
			System.out.println("****************************************************");
			System.out.println("�����뿪��������");
			Scanner in1 = new Scanner(System.in);
			String  CardName = in1.nextLine();
			System.out.println("�����뿨��");
			Scanner in2 = new Scanner(System.in);
			String  CardId = in2.nextLine();
			System.out.println("������Ԥ�����");
			Scanner in3 = new Scanner(System.in);
			String  CardPrice = in3.nextLine();
//			BankSys.add(new Bank(CardId,CardName,CardPrice));
			Bank bank = new Bank(CardId,CardName,CardPrice);
			bank.setCardId(CardId);
			bank.setCardName(CardName);
			bank.setCardPrice(CardPrice);		
			BankSys.add(bank);
			System.out.println("�����ɹ�!");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
			
/*��Ǯ*/
		case 2:
			System.out.println("*******************************/��ǰʱ��Ϊ:"+hour+"ʱ"+min+"��"+sec+"��/");
			System.out.println("**************************/��Ǯ\\*********************");
			System.out.println("****************************************************");
			System.out.println("���������п���:");
			Scanner in4 = new Scanner(System.in);
			String putId = in4.nextLine();
			boolean isfindPut = false;
			for(int i=0;i<BankSys.size();i++){
				if(putId.equals(BankSys.get(i).getCardId())){
					String str = BankSys.get(i).getCardPrice();
					System.out.println("��֤�ɹ�,�˻����Ϊ:"+str);
					System.out.println("������Ҫ����Ľ��:");
					Scanner in5 = new Scanner(System.in);
					int putidd = in5.nextInt();
					int a = Integer.parseInt(str);
					int add = putidd+a;
					String PuterPrice = String.valueOf(add);					
					BankSys.get(i).setCardPrice(PuterPrice);
					System.out.println("����֮�����Ϊ:"+PuterPrice);
					isfindPut = true;
				}
				
			}
			if(!isfindPut){
				System.out.println("��Ǹ,�Ҳ������û�!");
			}
			System.out.println("��Ǯ�ɹ�!");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
			
/*ȡǮ*/
		case 3:
			System.out.println("*******************************/��ǰʱ��Ϊ:"+hour+"ʱ"+min+"��"+sec+"��/");
			System.out.println("**************************/ȡǮ\\*********************");
			System.out.println("****************************************************");
			System.out.println("���������п���:");
			Scanner in6 = new Scanner(System.in);
			String takeId = in6.nextLine();
			boolean isfindTake = false;
			for(int j=0;j<BankSys.size();j++){
				if(takeId.equals(BankSys.get(j).getCardId())){
					String str1 = BankSys.get(j).getCardPrice();
					System.out.println("��֤�ɹ�,��ǰ���Ϊ:"+str1);
					
					System.out.println("������Ҫȡ���Ľ��:");
					Scanner in7 = new Scanner(System.in);
					int takeprice = in7.nextInt();
					int c = Integer.parseInt(str1);
					int remove = c-takeprice;
					String taker = String.valueOf(remove);
					BankSys.get(j).setCardPrice(taker);
					System.out.println("ȡ������Ϊ:"+taker);
					isfindTake = true;				
				}					
			}
			if(!isfindTake){
				System.out.println("��֤ʧ��!");
			}
			System.out.println("���������!");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
/*�˻���Ϣ*/
		case 4:
			System.out.println("*********************/�˻���Ϣ��ѯ\\*******************");
			System.out.println("****************************************************");
			System.out.println("\\*******\\���������п���:");
			Scanner in8 = new Scanner(System.in);
			String acount = in8.nextLine();
			boolean isfindAcount = false;
			for(int k=0;k<BankSys.size();k++){
				if(acount.equals(BankSys.get(k).getCardId())){
					System.out.println("��֤�ɹ�,��ǰ�˻���ϢΪ:");
					System.out.println("����:"+BankSys.get(k).getCardName());
					System.out.println("����:"+BankSys.get(k).getCardId());
					isfindAcount = true;
				}
			}
			if(!isfindAcount){
				System.out.println("��֤ʧ��,���²���");
			}
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
			
		case 5:
			System.exit(0);
			
		default:
			System.out.println("�����������������");
			break;
			
		}
		
	}
	
	

}
