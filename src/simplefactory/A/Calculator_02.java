package simplefactory.A;

import java.util.Scanner;

/**
 * 一步一个脚印实现简单工厂模式
 * 
 * 修改01中如下注意事项：
 * 1：变量命名不规范
 * 2：if判断多次
 * 3：被除数为0 的异常
 * @author KevinWin
 */
public class Calculator_02 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入第一个数字：");
			int fristNum = scan.nextInt();
			System.out.println("请输入运算符号（+ — * /）：");
			char strOperate = scan.next().charAt(0);
			System.out.println("请输入第二个数字：");
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
					result = "被除数不能为0";
					break;
				}
				result = String.valueOf(fristNum / twoNum);
				break;
			}
			scan.close();
			System.out.println("运算结果为：" + result);
		} catch (Exception e) {
			System.err.println("异常处理："+e);
		}
	}

}
