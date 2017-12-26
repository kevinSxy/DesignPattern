package strategy.B;
/**
 * �����շ���
 * @author KevinWin
 */
public class CashReturn  extends CashSuper {
	private double mCondition;
	private double mRetrun;
	public CashReturn(double mCondition, double mRetrun){
		this.mCondition = mCondition;
		this.mRetrun = mRetrun;
	}
	/**
	 * �����㷨����mCondition��mRetrun
	 */
	public double acceptCash(double money) {
		if(money >= mCondition){
			return money - mRetrun;
		}
		return money;
	}
}
