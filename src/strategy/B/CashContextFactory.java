package strategy.B;

/**
 * 策略模式中上下文类；简单工厂模式工厂类(此处可以使用抽象工厂模式，使用java中的反射)
 * 
 * @author KevinWin
 */
public class CashContextFactory {
	private CashSuper cs;
	
	/**
	 * @param type A:正常收费; B:折扣收费; C:返利收费
	 * @param mRebate
	 * @param mCondition
	 * @param mRetrun
	 */
	public CashContextFactory(char type, double mRebate, double mCondition,
			double mRetrun) {
		switch (type) {
		case 'A':
			cs = new CashNormal();
			break;
		case 'B':
			if (mRebate != 0.0) {
				cs = new CashRebate(mRebate);
			} else {
				cs = new CashNormal();
			}
			break;
		case 'C':
			cs = new CashReturn(mCondition, mRetrun);
			break;
		default:
			break;
		}
	}
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
