package simplefactory.B;

/**
 * һ��һ����ӡʵ�ּ򵥹���ģʽ
 * �������㸸��(��������࣬����̳и���ʵ�����㷽��������Ҳ����ʹ�ó����ֻ࣬Ҫ������д���෽������)
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
	 * ���㷽��
	 * @return
	 */
	public abstract String getResult();
}
