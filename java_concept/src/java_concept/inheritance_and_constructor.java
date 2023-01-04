package java_concept;
/*
 <상속에서의 생성자 규칙>
 
 < 자식 클래스의 생성자 >
 부모 클래스에 생성자가 있는 경우에서 자식 클래스의 생성자는 무엇을 호출할까?
 자식 클래스에 이미 해당하는 생성자가 만들어져 있다면 그것을 호출하겠지만,
 그렇지 않다면 암묵적으로 부모 클래스의 생성자, super()를 호출하게 된다
 
 하지만 상속 관계에 있는 클래스의 생성자에 기본 생성자(인자가 전혀 없는 생성자)가 아닌
 인자가 포함된 생성자를 사용하는 경우 주의해야한다.
 */
class Cal9{
    int v1,v2;
    Cal9(int v1, int v2){
        System.out.println("Cal9 init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}
class Cal10 extends Cal9{
    Cal10(int v1, int v2) {
        super(v1, v2);//이 줄은 부모클래스의 생성자를 가져오는거임
        // 생성자가 있는 클래스를 상속 받았다면, 부모클래스를 호풀해서 반드시 생성자를 불러야함
        System.out.println("Cal10 init!!");
    }
    public int minus(){return this.v1-v2;}
}
public class inheritance_and_constructor {

	public static void main(String[] args) {
		 Cal9 c = new Cal9(2,1);
	        Cal10 c3 = new Cal10(2, 1);
	        System.out.println(c3.sum()); // 3
	        System.out.println(c3.minus()); // 1

	}

}
/*
부모 클래스에 기본 생성자가 아닌 인자를 주는 생성자만 명시된 경우,
자식 클래스에서 생성자를 명시적으로 만들지 않는다면 컴파일이 되지 않습니다.
왜냐하면, 자식 클래스에서 생성자를 호출하는 경우(인스턴스 생성),
정의한 생성자가 없기 때문에 부모 클래스의 생성자(super())를 사용해야 하는데,
명시적으로 인자를 받는 생성자만 부모 클래스에 만들어져 있기 때문에 
기본 생성자가 없는 것으로 받아들여지기 때문입니다.

자식 클래스의 경우에도, 기본 생성자는 명시적으로 만들지 않고,
인자를 받는 생성자만 만들었을 경우에는 인수를 주지 않고 인스턴스를 생성할 수 없습니다.
따라서 부모 클래스에 인자를 받는 생성자만 만들었을 경우에는,
다음과 같이 자식 클래스에도 인자를 받는 생성자를 만들어야 합니다.
*/

/*
다음에 배울 내용들

< polymorphism (다형성) >
다형성은 상속 관계에 있는 클래스간의 호환성을 높여주는 기능이다.
우리가 인스턴스를 생성할 때, 같은 클래스의 자료형을 가진 변수를 선언하여 인스턴스를 생성해 왔다.
그런데 부모 클래스의 자료형을 가진 변수를 선언하여 자식 클래스의 인스턴스를 생성할 수 있다.
그렇게 생성한 변수에서 자식 클래스의 변수나 메소드를 호출할 수 있습니다.

< access modifier ( 접근 제어자 ) >
저번에 public과 private에 대해서 이미 알아본 바가 있다.
접근 제어자에는 이 외에도 default, protected라는 두 개의 접근 제어자가 더 있다.
default : 같은 패키지 내의 클래스에서는 접근할 수 있는 권한이 있다.
protected : 해당 클래스와 자식 클래스를 통해서 접근할 수 있다.

< final 키워드 >
상속과 관련하여 제한을 걸어주는 키워드이다.
만약 현재 클래스에서 더 이상 자식 클래스를 생성하지 못하게 막기 위해서는 클래스에 final키워드를 삽입한다.
그리고, 메소드가 자식 클래스에서 더 이상 오버라이드 되기를 원하지 않는다면 메소드에 final 키워드를 삽입한다.

< abstract 키워드 >
해당 클래스, 메소드가 재정의가 필요하다는 것을 강제하는 키워드이다.
abstract 메소드는 선언만 되어 있는 상태이고, abstract 클래스는 인스턴스로 만들 수 없다
만약 클래스 안에 abstract 메소드가 있다면 그 클래스는 abstract 클래스여야 한다. 
*/