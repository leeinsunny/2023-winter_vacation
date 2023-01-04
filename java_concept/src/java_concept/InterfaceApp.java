package java_concept;
/*
 세상에는 표준이라는 규격이 있다.
 마치 가정용 전기 제품은 220v 교류 전기를 사용한다는 것처럼 말이다.
 클래스를 생성할 때도, 이러한 약속, 규격에 해당하는 것이 인터페이스라고 할 수 있다.
-> 규격 = 인터페이스
 */
interface Calculable{
	int sum(int v1, int v2);
}

class firstRealcal implements Calculable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
}

class DummyCal implements Calculable{
	public int sum (int v1, int v2) {
		return 3;
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		
		firstRealcal c = new firstRealcal();
		
		System.out.println(c.sum(2,1));
	}

}

/*
 < 인터페이스 >
 interface를 이용하면 앞으로 만들 클래스의 메소드 규격을 선언할 수 있다.
 인터페이스에서 이를 이용해서 만들 클래스의 메소드 형식을 미리 선언하고,
 인터페이스를 이용해서 (implements 키워드) 만드는 클래스는 인터페이스의 메소드를 정의한다.
 */

/*
 < 인터페이스는 어떻게 활용하면 좋을까? >
 - 회사 내에서 만들어야 할 기능들을 회의를 통해서 팀장이 팀원들에게 알려줄 때, 각각의 파트에서 만들어야 할 
 	메소드들에 대한 인터페이스를 쭉~ 만들어서 나눠준다면 일의 진행속도도 빠르고 나중에 리뷰할 때도 편리할 것 같다.
 */
