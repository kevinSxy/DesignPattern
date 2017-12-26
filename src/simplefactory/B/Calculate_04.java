package simplefactory.B;

import java.util.Scanner;

/**
 * 一步一个脚印实现简单工厂模式
 * 通过封装、继承、多态把程序的耦合度降低。
 * 使用设计模式使得程序更加灵活、容易修改、复用。
 * 1：抽象一个计算类Operation 封装运算数据 fristNum 、twoNum
 * 2：将+ - * / 抽象成几个类，继承Operation，重写getResult方法
 * 3：抽象一个简单运算工厂类，根据运算符号获取不同计算方式。（此处使用了Java的多态特性）
 * 4：如果想扩展更多的运算，只需要编写一个类继承Operation，修改工厂类即可。
 * 以上就是简单工厂模式的实现。
 * @author KevinWin
 * 
 */
public class Calculate_04 {

	public static void main(String[] args) {
		try {
			Operation oper = null;
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入第一个数字：");
			int fristNum = scan.nextInt();
			System.out.println("请输入运算符号（+ — * /）：");
			char strOperate = scan.next().charAt(0);
			oper = OperationFactory.CreateOperate(strOperate);
			System.out.println("请输入第二个数字：");
			int twoNum = scan.nextInt();
			scan.close();
			oper.setFristNum(fristNum);
			oper.setFristTwo(twoNum);
			System.out.println("运算结果为：" + oper.getResult());
		} catch (Exception e) {
			System.err.println("异常处理：" + e);
		}
	}

}
