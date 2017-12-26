package strategy.A;

/**
 * 上下文
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
	 * 根据上下文strategy对象实现不同的算法
	 */
	public void contextInterface() {
		strategy.AlgorithmInterface();
	}
}
