package simplefactory.A;

import java.util.Scanner;

/**
 * 一步一个脚印实现简单工厂模式
 * 
 * 编码应该具备：可维护、可复用、可扩展、灵活性好等特性
 * 故应将业务逻辑和界面逻辑分开，让其耦合度下降，从而达到易维护、高扩展
 * @author KevinWin
 */
public class Calculator_03 {

	/**
	 * 将运算逻辑提取出来作为公共方法
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
				result = "被除数不能为0";
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
			System.out.println("请输入第一个数字：");
			int fristNum = scan.nextInt();
			System.out.println("请输入运算符号（+ — * /）：");
			char strOperate = scan.next().charAt(0);
			System.out.println("请输入第二个数字：");
			int twoNum = scan.nextInt();
			scan.close();
			System.out.println("运算结果为：" + new Calculator_03().operation(fristNum, strOperate, twoNum));
		} catch (Exception e) {
			System.err.println("异常处理："+e);
		}
	}

}
