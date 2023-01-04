package java_concept;
// < 예외의 처리 Exception handling >

public class ExceptionApp_2 {

	public static void main(String[] args) throws ArithmeticException{
		
		System.out.println(1);
		
		int[] scores = { 10, 20, 30 };
		
		try {
			System.out.println(2);
			
			System.out.println(scores[3]);//ArrayIndexOutOFBoundsException
			
			System.out.println(3);
			
			System.out.println(2/0);//ArithmeticException
			
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("잘못된 계산이네요");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값을 찾고 계시네요~!");
		}
		catch(Exception e) {
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다. ");
		}
		System.out.println(5);	
	}
}

/*
 < 실행 결과 >
	1
	2
	없는 값을 찾고 계시네요~!
	5
*/




/*
< 예외의 처리 >
예외가 발생한 뒤에 꼭 해야할 작업이 있다면, 뻗어버리는 프로그램의 경우 불안한 프로그램이다.
그렇다면 예외는 날지라도 그 뒤의 작업을 실행하기 위해서는 어떻게 해야할까?
try catch문을 이용해서 예외를 처리하면 이상한 경우에도 끝까지 실행될 수 있다.

배열에서 범위를 넘어서는 공간을 호출하거나, 이전과 같이 계산을 잘못했을 때
자바에서는 exception 클래스를 제공하여 예외를 처리할 수 있게 도와준다.

예외가 발생할 것으로 예상되는 부분을 try로 묶어서 처리하면, 일단 코드를 실행한다.
그리고 예외가 발생하는 코드가 실행되면 그 다음 코드를 실행하지 않고
해당 예외를 처리하는 catch 문으로 넘어간다.
catch문은 괄호 안에 예외 객체를 선언하고 예외 상황에서 실행할 코드를 입력한다.
catch문은 여러 개 넣을 수 있다. 이렇게 예외를 처리하면 마지막의 숫자 5까지 출력하고 프로그램이 정상적으로 종료된다. 
 */



/*
< 예외의 우선순위 >
< Exception 클래스 >
자바의 예외도 클래스로 구현되어 있다
ArithmeticException도 Java API문서를 참고하면, RuntimeException으로부터 상속받은 클래스라는 것을 알 수 있다.
또한 RuntimeException은 Exception 클래스로부터 상속받은 클래스이다.
그래서 이런 예외가 있더라도 Exception 클래스를 이용해서 포괄적으로 처리할 수 있다.

또한 예외의 처리에 있어서 catch문의 위치도 중요하다
try문에서 발생한 예외는 여러 개의 catch문을 순서대로 거쳐가면서
해당 catch문의 예외가 이번에 발생한 예외와 맞는지 확인한다.
그래서 맞다면 그 catch문을 실행한다.

try문에서 발생한 ArrayIndexOutOfBoundsException은 catch문을 순회하면서
처음으로 접하게 되는 곳인 Exception을 포괄적으로 잡는 catch문으로 가서 코드를 실행한다.
만약 ArithmeticException이 발생하는데, 이 역시 catch문을 순회하면서 처음으로 잡히게 되는 곳인
ArithmeticException을 잡는 catch문으로 가서 코드르 실행한다.
 */

/*
 < 왜 예외를 포괄적으로 처리하는 것이 좋지 않을까? >
 try문 안에 문장이 많이 있다면 예외가 발생한 이유에 대해서 알 수 없게 되어 예외가 발생한 코드를 어떤 식으로 수정해야할 지 모르기 때문이다.
 */
