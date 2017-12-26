package strategy.B;

/**
 * ’€ø€ ’∑—¿‡
 * @author KevinWin
 */
public class CashRebate extends CashSuper {
	private double mRebate;
	public CashRebate(double mRebate){
		this.mRebate = mRebate;
	}
	public double acceptCash(double money) {
		return money * mRebate;
	}
}
