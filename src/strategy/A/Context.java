package strategy.A;

/**
 * ������
 * 
 * @author KevinWin
 * 
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * ����������strategy����ʵ�ֲ�ͬ���㷨
	 */
	public void contextInterface() {
		strategy.AlgorithmInterface();
	}
}
