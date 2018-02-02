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
/*欢迎界面的输出显示*/
		System.out.println("******************/欢迎使用银行管理系统\\****************");
		System.out.println("****************************************************");
		System.out.println("\\*******\\请选择您要进行的操作:");
		System.out.println("\\1:开户:");
		System.out.println("\\2:存钱:");
		System.out.println("\\3:取钱:");
		System.out.println("\\4:账户信息:");
		System.out.println("\\5:关闭系统");
		System.out.println("请输入对应的编号:");
		
/*从控制台接收输入的数字*/
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		switch (num) {
/*新建一个账户*/
		case 1:
			System.out.println("*******************************/开户时间为:"+hour+"时"+min+"分"+sec+"秒/");
			System.out.println("**************************/开户\\*********************");
			System.out.println("****************************************************");
			System.out.println("请输入开户人姓名");
			Scanner in1 = new Scanner(System.in);
			String  CardName = in1.nextLine();
			System.out.println("请输入卡号");
			Scanner in2 = new Scanner(System.in);
			String  CardId = in2.nextLine();
			System.out.println("请输入预存款金额");
			Scanner in3 = new Scanner(System.in);
			String  CardPrice = in3.nextLine();
//			BankSys.add(new Bank(CardId,CardName,CardPrice));
			Bank bank = new Bank(CardId,CardName,CardPrice);
			bank.setCardId(CardId);
			bank.setCardName(CardName);
			bank.setCardPrice(CardPrice);		
			BankSys.add(bank);
			System.out.println("开户成功!");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
			
/*存钱*/
		case 2:
			System.out.println("*******************************/当前时间为:"+hour+"时"+min+"分"+sec+"秒/");
			System.out.println("**************************/存钱\\*********************");
			System.out.println("****************************************************");
			System.out.println("请输入银行卡号:");
			Scanner in4 = new Scanner(System.in);
			String putId = in4.nextLine();
			boolean isfindPut = false;
			for(int i=0;i<BankSys.size();i++){
				if(putId.equals(BankSys.get(i).getCardId())){
					String str = BankSys.get(i).getCardPrice();
					System.out.println("验证成功,账户余额为:"+str);
					System.out.println("请输入要存入的金额:");
					Scanner in5 = new Scanner(System.in);
					int putidd = in5.nextInt();
					int a = Integer.parseInt(str);
					int add = putidd+a;
					String PuterPrice = String.valueOf(add);					
					BankSys.get(i).setCardPrice(PuterPrice);
					System.out.println("存入之后余额为:"+PuterPrice);
					isfindPut = true;
				}
				
			}
			if(!isfindPut){
				System.out.println("抱歉,找不到该用户!");
			}
			System.out.println("存钱成功!");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
			
/*取钱*/
		case 3:
			System.out.println("*******************************/当前时间为:"+hour+"时"+min+"分"+sec+"秒/");
			System.out.println("**************************/取钱\\*********************");
			System.out.println("****************************************************");
			System.out.println("请输入银行卡号:");
			Scanner in6 = new Scanner(System.in);
			String takeId = in6.nextLine();
			boolean isfindTake = false;
			for(int j=0;j<BankSys.size();j++){
				if(takeId.equals(BankSys.get(j).getCardId())){
					String str1 = BankSys.get(j).getCardPrice();
					System.out.println("验证成功,当前余额为:"+str1);
					
					System.out.println("请输入要取出的金额:");
					Scanner in7 = new Scanner(System.in);
					int takeprice = in7.nextInt();
					int c = Integer.parseInt(str1);
					int remove = c-takeprice;
					String taker = String.valueOf(remove);
					BankSys.get(j).setCardPrice(taker);
					System.out.println("取款后余额为:"+taker);
					isfindTake = true;				
				}					
			}
			if(!isfindTake){
				System.out.println("验证失败!");
			}
			System.out.println("请继续操作!");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
/*账户信息*/
		case 4:
			System.out.println("*********************/账户信息查询\\*******************");
			System.out.println("****************************************************");
			System.out.println("\\*******\\请输入银行卡号:");
			Scanner in8 = new Scanner(System.in);
			String acount = in8.nextLine();
			boolean isfindAcount = false;
			for(int k=0;k<BankSys.size();k++){
				if(acount.equals(BankSys.get(k).getCardId())){
					System.out.println("验证成功,当前账户信息为:");
					System.out.println("姓名:"+BankSys.get(k).getCardName());
					System.out.println("卡号:"+BankSys.get(k).getCardId());
					isfindAcount = true;
				}
			}
			if(!isfindAcount){
				System.out.println("验证失败,重新操作");
			}
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			BankSelect(BankSys);
			break;
			
		case 5:
			System.exit(0);
			
		default:
			System.out.println("输入错误请重新输入");
			break;
			
		}
		
	}
	
	

}
