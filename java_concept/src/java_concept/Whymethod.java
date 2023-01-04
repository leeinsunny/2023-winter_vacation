package java_concept;

public class Whymethod {
//문자열과 구분자를 출력하는 메소드
	public static void main(String[] args) {
	
	printTwoTimes("a","-");
	printTwoTimes("a","*");
	printTwoTimes("a","&");
	printTwoTimes("b","!");

	}
	
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
/*
매개변수(parameter)는 메소드 안에서 통용되는 변수임
메소드를 호출할 때는 실제 데이터를 메소드의 파라미터 안에 넣게 되는데 이를 인자(아규먼트)라고 한다

main 메소드는 문자열 배열인 args 파라미터를 이용한다.
프로그램을 실행할 때 아규먼트로 주어지는 값을 넣게 되면
args에 아규먼트 값들이 들어가게 되고, 이를 이용해서 작업을 실행하게 된다.
	*/
}
