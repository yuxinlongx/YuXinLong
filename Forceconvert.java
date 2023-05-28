
public class Forceconvert{
	public static void main(String[] args){
		//1、演示强制类型转换:自动转换的逆过程
		int n1 = (int)1.1;
		System.out.println("n1 =" + n1);//1,精度损失

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1 =" + b1);//-48，数据溢出

		//2、强转符号只对最近的操作数有效，往往会使用小括号提升优先级
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);//double->int , 44.0->44

		//3、char可以保存int常量值，不能保存int变量值，需要强转
		char c2 = 100;
		int m = 100;
		//char c3 = m;
		char c4 = (char)m;
		System.out.println(c4);// 100对应的字符，d

		//4、byte和short类型运算时，当作int处理


		//5、基本类型转化成string +""即可
		System.out.println("==============");
		int n3 = 100;
		float n4 = 1.1f;
		double n5 = 1.4;
		boolean b2 = true;
		String str1 = n3 + "";
		String str2 = n4 + "";
		String str3 = n5 + "";
		String str4 = b2 + "";
		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);

		//6、string类型转基本类型，调用parsexx方法
		System.out.println("==============");
		String s1 = "123";
		int num1 = Integer.parseInt(s1);
		float num2 = Float.parseFloat(s1);
		//double num3 =Double.parseDouble(s1);
		byte num4 = Byte.parseByte(s1);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num4);
		System.out.println(b);
		//怎么把string =>转换成char
		System.out.println(s1.charAt(2));



	}

}