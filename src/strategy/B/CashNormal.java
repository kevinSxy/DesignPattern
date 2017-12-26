package strategy.B;

/**
 * 正常收费类
 * @author KevinWin
 */
public class CashNormal extends CashSuper {
	public double acceptCash(double money) {
		return money;
	}
}
