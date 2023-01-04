package java_concept;
/*
 < 생성자와 this 예약어 >
 */


class Print5{
	public String delimiter = "";
	public Print5(String delimiter) {
		this.delimiter = delimiter;
	}
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

public class MyOOP4_this {

	public static void main(String[] args) {
	     Print5 p1 = new Print5("----");
	        p1.A();
	        p1.A();
	        p1.B();
	        p1.B();
	 
	        Print5 p2 = new Print5("****");
	        p2.A();
	        p2.A();
	        p2.B();
	        p2.B();
	         
	         
	        p1.A();
	        p2.A();
	        p1.A();
	        p2.A();

	}

}
/*
< 생성자 > = 필드를 초기화해준다
클래스는 인스턴스를 생성할 때 클래스의 이름과 같은 이름인 생성자로 인스턴스를 만든다.
클래스는 따로 만들어 주지 않아도 기본 생성자를 포함하고 있다.
Print()와 같이 아무것도 지정하지 않는 생성자를 기본 생성자라고 한다.
기본적으로 public권한으로 설정되어 있어서 따로 명시하지 않아도 클래스를 만들게 되면
새로운 인스턴스를 생성할 수 있도록 만든다.

만약 처음에 인스턴스를 생성할 때부터 필드를 초기화하고 싶다면, 
필드를 초기화할 수 있게 만드는 생성자를 구성할 수 있다.
생성자는 접근 권한을 설정할 수 있고, 리턴 타입은 명시하지 않으며,
초기화할 필드에 따라 파라미터를 설정한다.

< this 키워드 >
생성자도 클래스 내부의 메소드이고, 보통 초기화할 필드를 파라미터로 넣기 때문에
생성자 내부에서 필드에 접근할 때 파라미터의 이름과 같게 되어 접근하기 어렵게 된다.
이 때 사용하는 예약어가 this인데, this는 인스턴스를 가리키는 예약어이다.
this를 통해 필드를 손쉽게 사용할 수 있다.
*/



/*
< this는 무엇일까? 인스턴스와 같은 것이라면 역시 또 다른 인스턴스라는 이야기인가? >
- 클래스로부터 여러 개의 인스턴스를 생성할 수 있는데, 각각의 인스턴스를 지정할 수 있도록
  'this'를 사용한다. 또 다른 인스턴스라기보다는 생성된 인스턴스의 필드나 메소드를 수정하거나 조작할 수 있도록
  그 인스턴스를 대표하는 예약어라고 볼 수 있다.

*/