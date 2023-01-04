package java_concept;
/*
 저번까지는 인스턴스의 참조로서 this키워드에 대해서 알아보았다.
 이와 비슷하게 상속관계에 있는 부모 클래스를 가리키는 super키워드도 있다.
 이번에는 super키워드에 대해서 알아보자
 */


/*
우선, 간단하게 this는 자기 자신 super는 자기 부모를 나타낸다고 생각하자 
 */


/*
 < Super >
 this는 인스턴스를 가리키는 키워드이다.
 이와 비슷하게 부모 클래스를 가리키는 super라는 키워드도 존재한다.
 자식 클래스에서 super를 이용하여 접근 권한이 부여된 부모 클래스의 변수와 메소드에 접근할 수 있다. 
 
 < Super 키워드는 어떤 점에서 편리한가? >
 부모클래스의 메소드를 오버라이딩했을 때, 자식클래스에서 부모클래스를 사용하고 싶은 경우에 super키워드
 하나만으로 부모 클래스의 메소드에 접근할 수 있다는 점이 편리하다. 
 */
class cal7{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	//overloading = 메소드이름은 같은데 매개변수 형식이나 수는 다름. 오버로딩이 과부하잖아
	public int sum(int v1, int v2, int v3) {
		return v1+v2+v3;
	}
}
class cal8 extends cal7{
	//overriding
	public int sum (int v1, int v2) {
		System.out.println("cal8-2개!!");
		return super.sum(v1, v2);
	}
	public int sum (int v1, int v2, int v3) {
		System.out.println("cal8-3개!!");
		return super.sum(v1, v2, v3);
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}

public class ThisSuper {

	public static void main(String[] args) {
		cal7 a = new cal7();
		cal8 b = new cal8();
		
		System.out.println("부모 클래스의 합계, 2개 : "+a.sum(1, 2));
		System.out.println("부모 클래스의 합계, 3개 : "+a.sum(1, 2, 3));
		
		System.out.println("자식 클래스의 합계, 2개 : "+b.sum(1, 2));
		System.out.println("자식 클래스의 합계, 3개 : "+b.sum(1, 2, 3));
		
		System.out.println("자식 클래스의 마이너스, 2개 : "+b.minus(5, 2));
	}

}
