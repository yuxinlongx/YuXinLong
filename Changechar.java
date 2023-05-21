//转义字符的使用

public class Changechar{
	public static void main(String[] args){


		// \t   ：一个制表位
		System.out.println("北京\t上海\t新疆");
		// \n    ：换行
		System.out.println("北京\n上海\n新疆");
		// \\    ：一个\ \\
		System.out.println("北京\\上海\\\\新疆");
		// \"\'  :输出"" ''
		System.out.println("他说：\"你是最棒的\"！");
		System.out.println("他说：\'你是最棒的\'！");
		// \r   ：回车
		System.out.println("你是\r最棒的");
		System.out.println("你是\r\n最棒的");
		System.out.println("你是\n\r最棒的");

	}
  }

   class Changechartxt1{
	public static void main(String[] args){
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

	}


}
