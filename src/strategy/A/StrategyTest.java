package strategy.A;

/**
 * 策略模式(Strategy)：定义算法规则，分别封装，让其相互替换，从而实现不同的算法。 不同时间不
 * 同场景使用不同业务规则
 * 实例化不同算法类，实现不同的算法规则
 * 
 * @author KevinWin
 * 
 */
public class StrategyTest {
	public static void main(String[] args) {
		Context ct = null;
		ct = new Context(new StrategyA());
		ct.contextInterface();
		ct = new Context(new StrategyB());
		ct.contextInterface();
		ct = new Context(new StrategyB());
		ct.contextInterface();
	}
}
