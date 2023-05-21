  //作业01，编写hello，word程序

 public class Chapter01hw{
	public static void main(String[] args){
	    System.out.println("hello,world");
	}
}


  //作业02，打印个人信息
class Chapter01hw2{
	public static void main(String[] args){
		System.out.println("姓名\t性别\t籍贯\t住址\n于鑫泷\t男\t天津\t蓟州区");
	}
}

   //作业03，JDK,JRE,JVM的关系
	 /*
	 1、JDK = JRE + java开发工具
	 2、JRE = JVM + 核心类库
	 */
 
   //作业04，环境变量path的配置及其作用
	  /*
	  1、环境变量的作用是未来在dos的任意目录，可以使用java和javac
	  2、先配置JAVA_HOME = 指向jdk安装路径
	  3、编辑path环境变量，增加%JAVA_HOME%\bin
	  */

   //作业05，java编写步骤
	  /*
	  1、编写Java源代码
	  2、用javac编译，得到.class字节码文件
	  3、用java运行，本质是把.class加载到JVM运行*/

   //作业06，java编写步骤规范
	  /*
	  1、类、方法使用javadoc注释，即文档注释
	  2、非javadoc注释用于对代码说明
	  3、使用tab（+shift）对选中左右移动
	  4、运算符和 = 两边加空格
	  5、源文件使用 utf-8 编码
	  6、行宽字符不要超过 80
	  7、代码风格：次行风格；行尾风格*/

   //作业07，java易犯错误
	  /*
	  1、编译或运行时，找不到文件 把文件名和目录找对
	  2、主类名和文件名不一致
	  3、缺少;（英文）
	  4、拼写错误*/
