package simplefactory.B;

public class OperationDiv extends Operation{

	/**
	 * 除法
	 */
	public String getResult() {
		if(twoNum==0){
			return "被除数不能为0";
		}
		return String.valueOf(fristNum / twoNum);
	}
}
