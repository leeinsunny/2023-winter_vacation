package java_concept;
class cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
}

class cal2{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}
/*
 이렇게 만들게 되면 코드의 양이 많아지는 것은 둘째치고,
 cal2의 sum메소드는 cal의 sum 메소드를 이어온것 임에도 불구하고
 1. 오리지널인 cal의 sum메소드를 수정하더라도 cal2의 sum메소드에는 어떤 영향을 끼치지 않는다.
 2. 코드의 양이 커지면 커질수록, 둘의 관계를 파악하는 것은 무척 어려워진다.
 -> 이를 보완하고자 '상속'을 이용하자
 */
class cal3 extends cal{
	
}
public class inheritanceApp {

	public static void main(String[] args) {
		cal c = new cal();
		System.out.println("상속 전 : " + c.sum(1, 2));
		cal3 c3 = new cal3();
		System.out.println("상속 후 : "+ c3.sum(1, 2));
	}

}
/*
이렇게 extends키워드를 사용해 cal3 클래스를 생성할 때, cal로부터 상속을 받을 수 있다.
cal3라는 cal로부터 상속받은 클래스에 아무것도 넣지 않아도, cal에 있는 메소드인 sum을 사용할 수 있다.
*/

/*
 < 상속을 이용하면 어떤 문제를 해결할 수 있을까? >
 - 이미 개발된 클래스를 재사용하여 새로운 클래스를 만들 때 중복되는 코드를 줄임
 - 부모 클래스의 한 번의 수정으로 모든 자식 클래스까지 수정되는 효과가 있어 유지보수 시간이 줄어듬
*/
