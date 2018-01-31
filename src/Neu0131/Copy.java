package Neu0131;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	/*复制一个文件*/
	public static void main(String[] args) throws IOException{
		int b=0;
		FileInputStream in = new FileInputStream("F:\\javadata\\Neuedu\\src\\Neu0131\\helloworld.txt");
		FileOutputStream out = new FileOutputStream("F:\\javadata\\hello_copy.txt");
		
		while((b=in.read())!=-1){
			out.write(b);
		}
		in.close();
		out.close();
		System.out.println("文件已经复制");
	}
}
