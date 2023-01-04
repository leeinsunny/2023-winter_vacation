package java_concept;
/*
< 클래스와 인스턴스의 차이 >
클래스 = 일종의 형틀 / 인스턴스 = 그 형틀로 찍어서 만든 실체
-> static 메소드 vs static이 아닌 메소드 = 클래스의 메소드 vs 인스턴스의 메소드

클래스는 프로그램에서 한 번 정의되는 형틀이다. 
그래서 static 메소드는 클래스의 메소드로, 프로그램에서 한 번만 정의된다. 
즉, 여러 개를 가질 수 없는 유일무이한 메소드이다.

반면 static이 아닌 메소드는 인스턴스의 메소드로, 프로그램에서 여러개 있을 수 있고,
그 인스턴스를 통해서 접근하는 메소드이다.
*/
class Print{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("b");
	}
	
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
	
	
}

public class staticMethod {
		public static void main(String[] args) {
		/*	
		 Print.a("-");
		 print.b("-");
		*/
			
			
		//instance
		Print t1 = new Print();
		t1.delimiter="-";
		t1.a();
		t1.b();
		Print.c("$");
		
		/*	
		 Print.a("*");
		 print.b("*");
		*/
		
		Print t2 = new Print();
		t2.delimiter="*";
		t2.a();
		t2.b();
			
		}
}

/*
 static 메소드인 c는 print클래스를 통해서 접근할 수 있다. 
 Math 클래스의 floor메소드는 클래스를 통해서 접근하는 static 메소드임.
 하지만 static메소드가 아닌 a와 b는 인스턴스 t1, t2를 생성해서 인스턴스를 통해 접근할 수 있는 메소드이다.
 string의 equals메소드는 인스턴스를 통해 접근할 수 있는 인스턴스 메소드이다.
 static 키워드는 필드에도 적용된다.
 */

/*
 < 왜 Static 메소드가 필요할까 >
 하나의 클래스로부터 여러 개의 instance를 생성하여 사용할 때, 각 instance에서 공통적으로 같은 것을 공유할 때는
 Static 메소드가 필요할 것 같다.
 
 차(car)를 예로 든다면 각각의 차 instance는 모델명, 색상, 브랜드가 다르겠지만 '시동걸기', '전진', '후진'은
 공통적으로 갖는 행동이므로 이것들은 static메소드로 활용할 수 있다. 
  */

