package Neu0131;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import javax.imageio.stream.FileImageInputStream;

/*IO�ļ���*/
public class Demo2 {
	public static void main(String[] args) throws IOException{
//		File file = new File("F:\\javadata\\cat.java");
//		System.out.println(file.exists());                           //�ж��ļ��ǲ�����
//		System.out.println(file.isFile());                         //�ж��ǲ����ļ�
//		System.out.println(file.getName());
//		System.out.println(file.mkdir());                         //����һ���ļ���
//		File file1 = new File("F:\\javadata\\cat2.java");          
//		System.out.println(file1.createNewFile());               //����һ���ļ�
//		System.out.println(file.length());					     //�鿴��С

			
		
/*input��output*/
/*ʹ���ֽ�����ȡ*/
//		File file = new File("F:\\javadata\\cat.txt");
//		InputStream is = new FileInputStream(file);
//		byte[] a = new byte[(int) file.length()];
//		is.read(a);
////		System.out.println(new String(a));

		
//		InputStream in = new FileInputStream(file);
//		byte[] a = new byte[(int) file.length()];
//		in.read(a);
//		System.out.println(new String(a));
	
/*ʹ���ַ�����ȡ*/
//		Reader read = new FileReader(file);
//		char[] c = new char[(int) file.length()];
//		read.read(c);
//		String b = new String(c);
//		System.out.println(c);
		
//		Reader re = new FileReader(file);
//		char[] a = new char[(int) file.length()];
//		re.read(a);
//		System.out.println(a);
		
/*ʹ���ֽ���д��*/
//		File file = new File("F:\\javadata\\cat.txt");
//		OutputStream os = new FileOutputStream(file,true);
//		String a = "asdfasdfasdfdsf";
//		os.write(a.getBytes());
//		System.out.println("д�����!");
//		os.close();
		
//		File file = new File("F:\\javadata\\cat.txt");
//		OutputStream os = new FileOutputStream(file);
//		String a = "asdfasdfasdf";
//		os.write(a.getBytes());
//		System.out.println("д�����");
//		os.close();
		
/*ʹ���ַ���д��*/	
//		File file = new File("F:\\javadata\\cat.txt");
//		Writer wr = new FileWriter(file);
//		wr.write("��ð�");
//		wr.close();
//		System.out.println("д�����");
		
/*ת����*/
		/*���ֽ���ת��Ϊ�ַ���*/
//		File in = new File("F:\\javadata\\cat.txt");
//		InputStream is = new FileInputStream(in);
//		InputStreamReader iser = new InputStreamReader(is);
//		
//		OutputStream out = new FileOutputStream(in);
//		OutputStreamWriter outer = new OutputStreamWriter(out);
		
/*BufferedReader*/
		File file = new File("F:\\javadata\\cat.txt");
		Reader read = new FileReader(file);
		BufferedReader reader = new BufferedReader(read);
		String str = reader.readLine();
		while(str!=null){
			System.out.println(str);
			str=reader.readLine();
		}
		reader.close();
		read.close();
	}
}
