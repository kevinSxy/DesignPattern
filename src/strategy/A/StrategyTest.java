package strategy.A;

/**
 * ����ģʽ(Strategy)�������㷨���򣬷ֱ��װ�������໥�滻���Ӷ�ʵ�ֲ�ͬ���㷨�� ��ͬʱ�䲻
 * ͬ����ʹ�ò�ͬҵ�����
 * ʵ������ͬ�㷨�࣬ʵ�ֲ�ͬ���㷨����
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
