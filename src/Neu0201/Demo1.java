package Neu0201;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws IOException{
/*0131��ҵ��ϰ*/
//    	File from = new File("F:\\javadata\\cat.txt");
//    	File to = new File("F:\\javadata\\cat3.txt");
//    	/*��ȡ�ļ�*/
//    	InputStream is = new FileInputStream(from);
//    	byte[] a = new byte[(int) from.length()];
//    	is.read(a);
//    	is.close();
//    	
//    	/*д��Ŀ���ļ�*/
//    	OutputStream os = new FileOutputStream(to);
//    	os.write(a);
//    	os.close();
//    	
//    	System.out.println("�������!!");
    	
/*0201 ʱ�������*/
    	
//    	Date date = new Date();
//    	/*��ͨ�޲η�����ȡ�����ص�������ʱ�������Ϣ*/
//    	System.out.println(date.getYear());
//    	System.out.println(date.getDay());
//    	System.out.println(date.getMonth()+1);
//    	System.out.println(date.getHours());
//    	System.out.println(date.getMinutes());
//    	System.out.println(date.getSeconds());
//    	
//    	
//  
//    	Date date1 = new Date();
//    	/*ͨ��SimpleDateFormat���趨���ڵĸ�ʽ*/
//    	SimpleDateFormat dt = new SimpleDateFormat("MM-yyyy-dd");
//    	String str = dt.format(date1);
//    	System.out.println(str);
//    	/*ͨ��SimpleDteFormat���parse()���趨һ��ֵ*/
//    	try {
//			Date d2 = dt.parse("04-1995-13");
//			System.out.println(d2);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
/*sort����*to.String()��ʾ�����е�����*/
//    	int[] a = {12,43,44,56,43,20,75,96};
//    	Arrays.sort(a);
//    	System.out.println(Arrays.toString(a));
    	
    	

    }
}
