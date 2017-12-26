package simplefactory.B;

/**
 * 简单运算工厂
 * @author KevinWin
 *
 */
public class OperationFactory {
	public static Operation CreateOperate(char strOperate){
		Operation oper=null;
		switch (strOperate) {
		case '+':
			oper = new OperationAdd();
			break;
		case '-':
			oper = new OperationSub();
			break;
		case '*':
			oper = new OperationMul();
			break;
		case '/':
			oper = new OperationDiv();;
			break;
		}
		return oper;
	}
}
