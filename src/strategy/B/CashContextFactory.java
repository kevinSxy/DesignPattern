package strategy.B;

/**
 * ����ģʽ���������ࣻ�򵥹���ģʽ������(�˴�����ʹ�ó��󹤳�ģʽ��ʹ��java�еķ���)
 * 
 * @author KevinWin
 */
public class CashContextFactory {
	private CashSuper cs;
	
	/**
	 * @param type A:�����շ�; B:�ۿ��շ�; C:�����շ�
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
