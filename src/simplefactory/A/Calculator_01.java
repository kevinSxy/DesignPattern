package simplefactory.A;

import java.util.Scanner;

/**
 * 一步一个脚印实现简单工厂模式
 * 
 * 编写一个简单计算器类
 * @author KevinWin
 */
public class Calculator_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字A：");
		int A = scan.nextInt();
		System.out.println("请输入运算符号（+ — * /）：");
		String B = scan.next();
		System.out.println("请输入数字C：");
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
		System.out.println("运算结果为："+D);
	}
}
