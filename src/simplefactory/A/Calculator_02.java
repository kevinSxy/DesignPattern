package simplefactory.A;

import java.util.Scanner;

/**
 * һ��һ����ӡʵ�ּ򵥹���ģʽ
 * 
 * �޸�01������ע�����
 * 1�������������淶
 * 2��if�ж϶��
 * 3��������Ϊ0 ���쳣
 * @author KevinWin
 */
public class Calculator_02 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("�������һ�����֣�");
			int fristNum = scan.nextInt();
			System.out.println("������������ţ�+ �� * /����");
			char strOperate = scan.next().charAt(0);
			System.out.println("������ڶ������֣�");
			int twoNum = scan.nextInt();
			String result = "";
			switch ((char) strOperate) {
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
			scan.close();
			System.out.println("������Ϊ��" + result);
		} catch (Exception e) {
			System.err.println("�쳣����"+e);
		}
	}

}
