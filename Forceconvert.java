
public class Forceconvert{
	public static void main(String[] args){
		//1����ʾǿ������ת��:�Զ�ת���������
		int n1 = (int)1.1;
		System.out.println("n1 =" + n1);//1,������ʧ

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1 =" + b1);//-48���������

		//2��ǿת����ֻ������Ĳ�������Ч��������ʹ��С�����������ȼ�
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);//double->int , 44.0->44

		//3��char���Ա���int����ֵ�����ܱ���int����ֵ����Ҫǿת
		char c2 = 100;
		int m = 100;
		//char c3 = m;
		char c4 = (char)m;
		System.out.println(c4);// 100��Ӧ���ַ���d

		//4��byte��short��������ʱ������int����


		//5����������ת����string +""����
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

		//6��string����ת�������ͣ�����parsexx����
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
		//��ô��string =>ת����char
		System.out.println(s1.charAt(2));



	}

}