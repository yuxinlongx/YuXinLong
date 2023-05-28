
public class Var{
	//编写一个main方法
	public static void main(String[] args){
		//记录人的信息
		int age = 30;
		double score = 88.9;
		char gender = '男';
		String name = "king";

		//输出信息,快捷键
		System.out.println(name);

	// +的使用
		/*
		1、当左右两边都是数值时，则做加法运算
		2、当左右两边有一方是字符串“”，则作拼接
		3、运算顺序，从左到右*/
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + 3 + "hello");
		System.out.println("hello" + 100 +3);


	}
}