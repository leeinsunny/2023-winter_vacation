package java_concept;
/*
 <static 변수와 메소드 >
 static 변수와 메소드는 클래스에서 생성된 모든 인스턴스가 공유하는 자원이다.
 그리고 인스턴스를 만들지 않고도 클래스에서 직접 호출할 수 있다.
 */

class Foo{
	public static String classVar = "I class var";
	
	public String instanceVar = "I instance var";
	//non-static
	
	public static void classMethod() {
		System.out.println(classVar); 
		//System.out.println(instanceVar); // Error
	}
	
	//non-static method
	public void instanceMethod() {
		System.out.println(classVar);  //ok
		System.out.println(instanceVar);//ok
	}
}

public class staticAPP {

	public static void main(String[] args) {
	System.out.println(Foo.classVar);
		
//		//System.out.println(Foo.instanceVar);
//		//오류 내용 : Cannot make a static reference to the non-static field Foo.instanceVar
//		
		Foo.classMethod();
	
//		Foo.instanceMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f2.instanceVar); // I instance var
		
	f1.classVar = "changed by f1";
	System.out.println(Foo.classVar); // changed by f1
	System.out.println(f2.classVar); // changed by f1
	
	f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);//changed by f1
		System.out.println(f2.instanceVar);//I instance var
	}

}
/*
 인스턴스를 생성하지 않고 클래스에서 바로 인스턴스의 변수와 메소드에 접근할 수 없다.
 즉. static이 아닌 변수와 메소드는 인스턴스를 생성해야 비로소 접근할 수 있게된다.
 
 static 변수와 메소드는 해당 클래스로 생성된 모든 인스턴스가 공유하는 자원이기 때문에,
 인스턴스 모두는 같은 static 변수와 메소드를 사용할 수 있다.
 
 반면, static이 아닌 변수와 메소드는 인스턴스마다 고유의 값을 가지기 때문에 
 인스턴스에서 변경한다고 해도 다른 인스턴스에 어떠한 영향도 끼치지 않는다. 
 */

/*
 < 구체적으로 어떤 경우에 static 변수와 메소드를 사용하고, 어떤 경우에 static이 아닌 변수와 메소드를 이용해야 할까요? >
 - Static이 붙은 것 : 클래스가 존재하는 시점에 바로 사용할 수 있는 클래스의 소속임
   Static이 안 붙은 것 : instance가 만들어지는 시점부터 사용 가능함-> 왜냐? instance가 만들어질때 메모리에 올라가기 때문
   
   즉, 클래스 소속인 static이 붙은 클래스/ 변수는 같은 static이 붙은 애들끼린 참조할 수 있지만,
   아직 인스턴스가 만들어지기 전인 클래스 내부에서는 static이 붙지 않은 애들은 참조할 수 없는 원리이다.
   
   static이 붙은 것은 위에서 언급했듯이 클래스가 선언되는 시점에 메모리에 올라가게 되는 것이며, 
   이후 instance에 의해 그 값이 변했다면 같은 클래스에서 만들어진 모든 instance들이 영향을 받게 된다.
   
   static이 붙지 않은 것은 instance가 생성되는 시점에 메모리에 올라가기 때문에 instance마다 별도의 변수/메소드를 갖게 되는 것이다. 
   따라서 각각은 독립적이기 때문에 값이 바뀐다 해도 서로에게 영향을 미치지 않는다. 
 */
















