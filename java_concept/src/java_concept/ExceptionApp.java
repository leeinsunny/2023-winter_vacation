package java_concept;

public class ExceptionApp {

	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2/0);//Run-Time Exception, ArithmeticException
	System.out.println(3);
	}

}

/*
 < 예외의 발생 >
 < 예외가 발생하는 이유 >
 예외는 왜 발생할까?
 여러 경우가 있겠지만, 프로그램이 실행하는 동안에 프로그램을 만든 사람들이 설계한 모양대로 운영되지 않았기 때문이다.
 
 < ArithmeticException >
 자바에서는 숫자를 0으로 나누는 경우에 예외로 처리한다.
 실제로 실행을 시켜보면 arithmeticexception이라고 알려주고, 0으로 나누었다는 설명도 나오게 된다.
 나누는 숫자를 이 겨우에 직접 입력하여 구현하였지만,
 나누는 숫자를 인자로 받아서 프로그램을 구동하는 경우가 있을 수 있다.
 사용자가 입력한 값에 따라서 나누는 숫자가 결정된다면, 나누는 숫자가 0이 절대 아니라는 보장이 없다. 
 
 */
