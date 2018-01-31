package Neu0130;

public class TestEnum {
	/*enum枚举类型简单例子*/
	public enum MyColor{red,green,blue};
	public enum MyDoorOpenr{me,mywife};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyColor m = MyColor.green;
		switch(m){
			case red:
				System.out.println("red");
				break;
			case green:
				System.out.println("green");
				break;
			default:
				System.out.println("default");
		
		}
		System.out.println(m);
	}

}
