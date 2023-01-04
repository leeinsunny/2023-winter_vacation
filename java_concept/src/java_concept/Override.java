package java_concept;
/*
 자식 클래스에 부모 클래스가 없는 기능을 추가 혹은 부모 클래스가 있는 기능을 보완하는 걸 알아보자
 keyword - superclass(부모클래스), subclass(자식클래스), override(재정의)
 */


/*
 superclass(부모클래스)가 가지고 있는 기능을 마냥 답습하기만 하는 자식 클래스(subclass)라면 만들필요가 없다.
 부모 클래스가 할 수 없는 작업을 할 수 있어야, 자식클래스를 만드는 의미가 있을 것이다.
 그렇다면 자식클래스에 새로운 기능을 추가하기 위해서는 어떻게 해야 할까?
 -> 우선 부모클래스에 없는 기능이라면 그냥 추가해주면 된다.
 */

class call{
	public int sum (int v1, int v2) {
		return v1 + v2;
	}
}

class cal4 extends call{
	public int minus (int v1, int v2) {
		return v1-v2;
	}
}
/*
 뺄셈 기능을 자식 클래스에 추가한다면 새롭게 메소드를 정의해서 넣으면 된다
 변수도 마찬가지이다
 
 만약 부모 클래스가 가진 기능이지만 더 보완하고 싶다면 어떻게 해야할까?
 같은 이름으로 다시 override(재정의)하면 된다.
 */
class cal5 extends call{
	public int sum(int v1, int v2) {
		System.out.println("call5!!");
		return v1+v2;
	}
//여기 위에가 부모 클래스의 sum을 override한 부분임	
	
	public int minus (int v1, int v2) {
		return v1-v2;
	}
}
public class Override {

	public static void main(String[] args) {
		call cc = new call();
		System.out.println("부모클래스 사용한 합계 : " + cc.sum(1, 2));
		
		cal4 c4 = new cal4();
		System.out.println("자식클래스 사용한 합계 : " +c4.sum(1,2));
		System.out.println("자식클래스 사용한 마이너스 : " + c4.minus(5, 3));
		
		cal5 c5 = new cal5();
		System.out.println("자식클래스가 오버라이드한 합계 : "+c5.sum(1, 2));
	}

}
/*
< 어떤 경우에 부모 클래스의 메소드를 재정의해야할까? 구체적인 상황을 생각해보자 >
-  예를 들어, '달리기 게임'을 만들었을 때, 처음엔 모든 유저가 '기본 아바타'를 가지고 있어서 run()메소드를 실행했을 때,
   속도가 1로 달리도록 되어 있다고 한다면, 결제를 해서 '프리미엄 아바타'를 구매한 유저는 프리미엄 아바타로 게임을 할 때,
   'run()'메소드를 실행하면 기존의 속도에 1.2배만큼 빨리 달리도록 'run' method안에 있는 속도에 1이 아닌 1*1.2가 들어가도록
  	재정의 할 수 있다.
 */
