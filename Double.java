
public class Double{
	public static void main(String[] args){

	//浮点数类型
		double num1 = 1.1;
		double num2 = 1.1f;
		float num3  = 1.1f;
		//float num4 = 1.1; 错误

	//十进制数形式
		double num5 = .123;
		System.out.println(num5);
	//科学计数法
		System.out.println(5.12E2);
		System.out.println(5.12e-2);

	//double精确度更高
		double num6 = 2.123456789;
		float  num7 = 2.123456789f;
		System.out.println(num6);
		System.out.println(num7);

	//对计算结果是小数的进行相等比较时要小心
		double num8 = 2.7;
		double num9 = 8.1 / 3;
		System.out.println(num8);
		System.out.println(num9);
	//应该以两个数的差值的绝对值，在某个精度范围内判断
		if( Math.abs(num9 - num8) < 0.000001){
			System.out.println("差距非常小");
				}
		}
}