package strategy.B;
/**
 * ʹ�ò���ģʽʵ�֣� �̳����۴����ȳ���
 * @author KevinWin
 */
public class CashTest {
	public static void main(String[] args) {
		CashContextFactory csf=null;
		double actualPay=0.0;
		//�����շ�
		csf=new CashContextFactory('A', 0.0, 0.0, 0.0);
		actualPay =csf.getResult(500);
		System.out.println(actualPay);
		//�ۿ��շ�
		csf=new CashContextFactory('B', 0.8, 0.0, 0.0);
		actualPay =csf.getResult(500);
		System.out.println(actualPay);
		//�����շ�
		csf=new CashContextFactory('C', 0.0, 500, 150);
		actualPay =csf.getResult(500);
		System.out.println(actualPay);
	}
}
