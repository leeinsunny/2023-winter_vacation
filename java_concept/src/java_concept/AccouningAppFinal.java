package java_concept;

class Accountingfianl{
	public static double valueOfSupply;
	public static double vatRate = 0.1;
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal(){
		return valueOfSupply + getVAT();
	}
}

public class AccouningAppFinal {

	public static void main(String[] args) {
		Accountingfianl.valueOfSupply = 10000.0;
		System.out.println("value of supply : "+ Accountingfianl.valueOfSupply);
		System.out.println(" VAT : "+ Accountingfianl.getVAT());
		System.out.println(" Total: "+ Accountingfianl.getTotal());
	}

}
