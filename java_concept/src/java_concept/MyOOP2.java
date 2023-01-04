package java_concept;

public class MyOOP2 {

	public static void main(String[] args) {
		Print2.delimiter="-------";
		Print2.ALL();
		
		Print2.delimiter="*******";
		Print2.ALL();
	}

}
/*
< 클래스의 장점 >
클래스는 관련있는 변수들과 메소드를 묶어서 정리정돈을 할 수 있게 한다.
구분자로 분리된 A 문자열과 B 문자열을 출력하는 메소드를 
print라는 클래스로 따로 떼어내서 만들 수 있게 되었다

그래서 굳이 메소드의 이름을 printA라고 적지 않고 A라고만 적어도 
Print객체의 A메소드이기 때문에 A를 출력한다는 의미를 쉽게 유추할 수 있게 된다

또한 이클립스와 같은 IDE프로그램을 이용하게 되면,
접근할 수 있는 클래스의 메소드, 변수를 추천해주는 기능도 존재하기 때문에
프로그램을 작성하는데에도 편의성을 증진시킬 수 있게 된다. 
*/



/*
<이클립스에서 유용한거>

1. 메소드 만들기
- 메소드로 만들고 싶은 부분 드래그 -> refactor -> extract method
- 이렇게 하면 한 번에 메소드 만들 수 있음

2. public이 아닌데 같은 파일에 있는 클래스를 다른 파일로 옮기기
- 현재 파일에서 다른 파일로 옮기고 싶은 클래스를 다른 파일로 한 번에 옮길 수 있음
- 옮기고 싶은 클래스 드래그 -> refactor -> Move type to new file -> 그러면 미리 보기 창이 뜬다 -> ok버튼을 누르면 끝
- 근데 여기서 "Move type to new file"에서 클래스를 그냥 하나의 데이터 타입이라고 생각하자!
- 그리고 클래스를 다른 파일로 만들어도 같은 패키지 안에 있기때문에 import를 하지 않아도 된다!
*/