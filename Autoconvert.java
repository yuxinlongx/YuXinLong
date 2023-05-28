
public class Autoconvert{
	public static void main(String[] args){
		//自动转换联习
		int a = 'c';
		double b = 80;
		System.out.println(a);
		System.out.println(b);

		//1、多种数据类型混合运算，自动转换成容量大的，在计算
		int n1 = 10;//ok
		//float d1 = n1 + 1.1;//no
		double d1 = n1 +1.1;//ok
		float f1 = n1 + 1.1f;//ok

		//2、精度大的赋值给小的时会报错

		//3、（byte short）和char不能自动转换
		byte b1 = 10;//ok , -128~127
		/*int n2 = 1;
		byte b2 = n2;  no*/
		//char c1 = b1;// no, 不能自动转换

		//4、byte, short, char三者可以计算，在计算前首先转化为int类型
		byte b3 = 1;
		short s1 = 100;
		char c2 = 't';
		int sum = b3 + s1 + c2; 
		System.out.println(sum);

		//5、boolean不参与转换

		//6、输出结果自动提升为操作数中最大类型


	}
	
}	
