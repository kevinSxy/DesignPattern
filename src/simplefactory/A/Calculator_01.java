package simplefactory.A;

import java.util.Scanner;

/**
 * һ��һ����ӡʵ�ּ򵥹���ģʽ
 * 
 * ��дһ���򵥼�������
 * @author KevinWin
 */
public class Calculator_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������A��");
		int A = scan.nextInt();
		System.out.println("������������ţ�+ �� * /����");
		String B = scan.next();
		System.out.println("����������C��");
		int C = scan.nextInt();
		int D = 0;
		if("+".equals(B)){
			D = A + C;
		}
		if("-".equals(B)){
			D = A - C;
		}
		if("*".equals(B)){
			D = A * C;
		}
		if("/".equals(B)){
			D = A / C;
		}
		scan.close();
		System.out.println("������Ϊ��"+D);
	}
}
