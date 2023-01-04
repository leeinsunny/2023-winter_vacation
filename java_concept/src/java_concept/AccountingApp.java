package java_concept;

public class AccountingApp {
	//공급가액
	public static double valueOfSupply = 10000.0;
	//부가가치세율
	public static double vatRate = 0.1;
	//여기까지는 필드
	/*
	 1. 이때 공급가와 부가가치세율은 모든 메소드에서 바로 접근할 수 있게 클래스의 static 필드로 빼내었다
	 2. 메소드 안에서 메소드를 호출할 수 있다.
	 -main 메소드에서 여러 메소드를 호출할 수 있었던 것처럼 우리가 만든 메소드도 다른 메소드를 호출할 수 있다.
	 이렇게 메소드를 이용해서 만든 코드는 재사용성이 훨씬 높아진다. 
	
	 */
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal(){
		return valueOfSupply+getVAT();
	}
	
	public static void main(String[] args) {
	
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT :" + getVAT());
		System.out.println("TOTAL : " + valueOfSupply + getTotal());
	}

}
