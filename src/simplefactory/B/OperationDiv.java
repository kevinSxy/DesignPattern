package simplefactory.B;

public class OperationDiv extends Operation{

	/**
	 * ����
	 */
	public String getResult() {
		if(twoNum==0){
			return "����������Ϊ0";
		}
		return String.valueOf(fristNum / twoNum);
	}
}
