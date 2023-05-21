//注释演示

//单行注释
/* 
  多行注释(不能嵌套)
*/

 //文档注释 javadoc -d 文件名(d:\\temp) -xx -yy Comment01.java
  /**
  *@author  jason 
  *@version 1.2
  */


public class Comment01{
	public static void main(String[] args){
		int n1 = 10;
		int n2 = 20;
		int out = n1 + n2;
	    System.out.println("输出=" + out);
	}
}
