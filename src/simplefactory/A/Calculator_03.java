package simplefactory.A;

import java.util.Scanner;

/**
 * һ��һ����ӡʵ�ּ򵥹���ģʽ
 * 
 * ����Ӧ�þ߱�����ά�����ɸ��á�����չ������Ժõ�����
 * ��Ӧ��ҵ���߼��ͽ����߼��ֿ���������϶��½����Ӷ��ﵽ��ά��������չ
 * @author KevinWin
 */
public class Calculator_03 {

	/**
	 * �������߼���ȡ������Ϊ��������
	 * @param fristNum 
	 * @param strOperate
	 * @param twoNum
	 * @return
	 */
	public String operation(int fristNum,char strOperate, int twoNum){
		String result = "";
		switch (strOperate) {
		case '+':
			result = String.valueOf(fristNum + twoNum);
			break;
		case '-':
			result = String.valueOf(fristNum - twoNum);
			break;
		case '*':
			result = String.valueOf(fristNum * twoNum);
			break;
		case '/':
			if(twoNum==0){
				result = "����������Ϊ0";
				break;
			}
			result = String.valueOf(fristNum / twoNum);
			break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("�������һ�����֣�");
			int fristNum = scan.nextInt();
			System.out.println("������������ţ�+ �� * /����");
			char strOperate = scan.next().charAt(0);
			System.out.println("������ڶ������֣�");
			int twoNum = scan.nextInt();
			scan.close();
			System.out.println("������Ϊ��" + new Calculator_03().operation(fristNum, strOperate, twoNum));
		} catch (Exception e) {
			System.err.println("�쳣����"+e);
		}
	}

}
