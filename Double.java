
public class Double{
	public static void main(String[] args){

	//����������
		double num1 = 1.1;
		double num2 = 1.1f;
		float num3  = 1.1f;
		//float num4 = 1.1; ����

	//ʮ��������ʽ
		double num5 = .123;
		System.out.println(num5);
	//��ѧ������
		System.out.println(5.12E2);
		System.out.println(5.12e-2);

	//double��ȷ�ȸ���
		double num6 = 2.123456789;
		float  num7 = 2.123456789f;
		System.out.println(num6);
		System.out.println(num7);

	//�Լ�������С���Ľ�����ȱȽ�ʱҪС��
		double num8 = 2.7;
		double num9 = 8.1 / 3;
		System.out.println(num8);
		System.out.println(num9);
	//Ӧ�����������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if( Math.abs(num9 - num8) < 0.000001){
			System.out.println("���ǳ�С");
				}
		}
}