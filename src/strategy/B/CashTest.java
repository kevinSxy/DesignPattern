package strategy.B;
/**
 * 使用策略模式实现， 商场打折促销等场景
 * @author KevinWin
 */
public class CashTest {
	public static void main(String[] args) {
		CashContextFactory csf=null;
		double actualPay=0.0;
		//正常收费
		csf=new CashContextFactory('A', 0.0, 0.0, 0.0);
		actualPay =csf.getResult(500);
		System.out.println(actualPay);
		//折扣收费
		csf=new CashContextFactory('B', 0.8, 0.0, 0.0);
		actualPay =csf.getResult(500);
		System.out.println(actualPay);
		//返利收费
		csf=new CashContextFactory('C', 0.0, 500, 150);
		actualPay =csf.getResult(500);
		System.out.println(actualPay);
	}
}
