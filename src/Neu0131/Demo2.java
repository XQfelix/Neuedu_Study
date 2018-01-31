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

/*IO文件流*/
public class Demo2 {
	public static void main(String[] args) throws IOException{
//		File file = new File("F:\\javadata\\cat.java");
//		System.out.println(file.exists());                           //判断文件是不存在
//		System.out.println(file.isFile());                         //判断是不是文件
//		System.out.println(file.getName());
//		System.out.println(file.mkdir());                         //创建一个文件夹
//		File file1 = new File("F:\\javadata\\cat2.java");          
//		System.out.println(file1.createNewFile());               //创建一个文件
//		System.out.println(file.length());					     //查看大小

			
		
/*input和output*/
/*使用字节流读取*/
//		File file = new File("F:\\javadata\\cat.txt");
//		InputStream is = new FileInputStream(file);
//		byte[] a = new byte[(int) file.length()];
//		is.read(a);
////		System.out.println(new String(a));

		
//		InputStream in = new FileInputStream(file);
//		byte[] a = new byte[(int) file.length()];
//		in.read(a);
//		System.out.println(new String(a));
	
/*使用字符流读取*/
//		Reader read = new FileReader(file);
//		char[] c = new char[(int) file.length()];
//		read.read(c);
//		String b = new String(c);
//		System.out.println(c);
		
//		Reader re = new FileReader(file);
//		char[] a = new char[(int) file.length()];
//		re.read(a);
//		System.out.println(a);
		
/*使用字节流写入*/
//		File file = new File("F:\\javadata\\cat.txt");
//		OutputStream os = new FileOutputStream(file,true);
//		String a = "asdfasdfasdfdsf";
//		os.write(a.getBytes());
//		System.out.println("写入完成!");
//		os.close();
		
//		File file = new File("F:\\javadata\\cat.txt");
//		OutputStream os = new FileOutputStream(file);
//		String a = "asdfasdfasdf";
//		os.write(a.getBytes());
//		System.out.println("写入完成");
//		os.close();
		
/*使用字符流写入*/	
//		File file = new File("F:\\javadata\\cat.txt");
//		Writer wr = new FileWriter(file);
//		wr.write("你好啊");
//		wr.close();
//		System.out.println("写入完成");
		
/*转换流*/
		/*将字节流转换为字符流*/
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
