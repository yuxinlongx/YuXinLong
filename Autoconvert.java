
public class Autoconvert{
	public static void main(String[] args){
		//�Զ�ת����ϰ
		int a = 'c';
		double b = 80;
		System.out.println(a);
		System.out.println(b);

		//1�������������ͻ�����㣬�Զ�ת����������ģ��ڼ���
		int n1 = 10;//ok
		//float d1 = n1 + 1.1;//no
		double d1 = n1 +1.1;//ok
		float f1 = n1 + 1.1f;//ok

		//2�����ȴ�ĸ�ֵ��С��ʱ�ᱨ��

		//3����byte short����char�����Զ�ת��
		byte b1 = 10;//ok , -128~127
		/*int n2 = 1;
		byte b2 = n2;  no*/
		//char c1 = b1;// no, �����Զ�ת��

		//4��byte, short, char���߿��Լ��㣬�ڼ���ǰ����ת��Ϊint����
		byte b3 = 1;
		short s1 = 100;
		char c2 = 't';
		int sum = b3 + s1 + c2; 
		System.out.println(sum);

		//5��boolean������ת��

		//6���������Զ�����Ϊ���������������


	}
	
}	
