package java_concept;
/*
 < override와 overload의 차이점 >
 Overloading
 오버로딩은 상속과는 직접적인 관련이 없다
 특정 이름을 지닌 메소드가 있다고 할지라도, 우리는 같은 이름을 가진 메소드를 또 만들 수 있다. 
 다만 parameter, 매개변수의 형식이 달라야 한다
 */
class cal_overlodaing{
	public int sum ( int v1, int v2) {
		return v1 + v2;
	}

	public int sum ( int v1, int v2, int v3) {
		return v1+v2+v3;
	} 
}

public class Overload {

	public static void main(String[] args) {
		cal_overlodaing a = new cal_overlodaing();
		System.out.println("매개변수가 2개 일 때: " + a.sum(1, 2));
		System.out.println("매개변수가 3개 일 때: "+a.sum(1, 2, 3));
	}

}
/*
 이렇게 같은 이름을 가진 메소드라고 해도, 메소드를 호출할 때는 파라미터의 형식도 모두 보기 때문에
 프로그램은 각각의 메소드가 서로 애매하다고 판단하지 않는다.
 
 반면 overriding은 같은 클래스 안에서는 이뤄질 수 없고, 상속관계를 가진 클래스 사이에서 이뤄질 수 있다.
*/
