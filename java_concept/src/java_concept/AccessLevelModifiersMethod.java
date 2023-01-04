package java_concept;

class Greeting{
	public static void hi2() {
		System.out.println("hi2");
	}
	
	/*
	 private static void hi2() {
		System.out.println("hi2");
	}
	*/
}

public class AccessLevelModifiersMethod {
	
	private static void hi1() {
		System.out.println("Hi1");
	}
	
	public static void main(String[] args) {
		hi1(); //<-hi1은 잘 시행된다. 
		/* 근데 private 메소드가 다른 클래스에 있는 메소드라면
		 main 메소드에서 잘 움직일까?
		 hi2를 main메소드에서 부르면 오류를 내게 된다.
		 왜냐하면 hi2는 greeting 클래스 밖에서 직접 접근해서 사용할 수 없기 때문이다.
		 이것이 private의 접근 권한이다.
		 hi2메소드를 public으로 전환한다면 잘 시행된다. public은 클래스 외부에서도 바로 접근해서 사용할 수 있기 때문이다.
		 
		  그렇다면 왜 접근 제어라는 장치가 있는걸까?
		  public은 선풍기의 버튼들과 같이 사용자가 외부에서 선풍기의 동작을 제어하기 위해서
		  바깥으로 드러나서 호출할 수 있는 것들을 위해 지정한다
		  
		  private은 선풍기의 부품들과 전선들과 같이 동작을 위해 꼭 필요하지만,
		  외부에서 굳이 알 필요도 없거나 알아서는 안되는 것들을 위해서 지정한다.
		 */
		Greeting.hi2(); //<- hi2메소드가 위에서 private으로 지정되면 이 부분이 오류가 뜨게된다.
	}
}



