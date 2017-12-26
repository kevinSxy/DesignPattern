package simplefactory.B;

/**
 * 一步一个脚印实现简单工厂模式
 * 定义运算父类(父类抽象类，子类继承父类实现运算方法；父类也可以使用抽象类，只要子类重写父类方法即可)
 * @author KevinWin
 */
abstract class Operation {

	int fristNum; 
	int twoNum;
	public int getFristNum() {
		return fristNum;
	}
	public void setFristNum(int fristNum) {
		this.fristNum = fristNum;
	}
	public int getFristTwo() {
		return twoNum;
	}
	public void setFristTwo(int twoNum) {
		this.twoNum = twoNum;
	}
	/**
	 * 运算方法
	 * @return
	 */
	public abstract String getResult();
}
