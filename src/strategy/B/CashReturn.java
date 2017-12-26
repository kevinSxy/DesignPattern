package strategy.B;
/**
 * 返利收费类
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
	 * 返利算法，满mCondition减mRetrun
	 */
	public double acceptCash(double money) {
		if(money >= mCondition){
			return money - mRetrun;
		}
		return money;
	}
}
