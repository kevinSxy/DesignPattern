package strategy.B;
/**
 * 商场打折策略父类
 * @author KevinWin
 */
public abstract class CashSuper {
	/**
	 * 计算折后金额
	 * @param money	金额
	 * @return
	 */
	public abstract double acceptCash(double money);
}
