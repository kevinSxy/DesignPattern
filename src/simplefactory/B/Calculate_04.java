package simplefactory.B;

import java.util.Scanner;

/**
 * һ��һ����ӡʵ�ּ򵥹���ģʽ
 * ͨ����װ���̳С���̬�ѳ������϶Ƚ��͡�
 * ʹ�����ģʽʹ�ó�������������޸ġ����á�
 * 1������һ��������Operation ��װ�������� fristNum ��twoNum
 * 2����+ - * / ����ɼ����࣬�̳�Operation����дgetResult����
 * 3������һ�������㹤���࣬����������Ż�ȡ��ͬ���㷽ʽ�����˴�ʹ����Java�Ķ�̬���ԣ�
 * 4���������չ��������㣬ֻ��Ҫ��дһ����̳�Operation���޸Ĺ����༴�ɡ�
 * ���Ͼ��Ǽ򵥹���ģʽ��ʵ�֡�
 * @author KevinWin
 * 
 */
public class Calculate_04 {

	public static void main(String[] args) {
		try {
			Operation oper = null;
			Scanner scan = new Scanner(System.in);
			System.out.println("�������һ�����֣�");
			int fristNum = scan.nextInt();
			System.out.println("������������ţ�+ �� * /����");
			char strOperate = scan.next().charAt(0);
			oper = OperationFactory.CreateOperate(strOperate);
			System.out.println("������ڶ������֣�");
			int twoNum = scan.nextInt();
			scan.close();
			oper.setFristNum(fristNum);
			oper.setFristTwo(twoNum);
			System.out.println("������Ϊ��" + oper.getResult());
		} catch (Exception e) {
			System.err.println("�쳣����" + e);
		}
	}

}
