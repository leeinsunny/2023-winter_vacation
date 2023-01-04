package java_concept;

//< 클래스와 인스턴스의 활용 >
import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args)throws IOException{
		// class : System, Math, FileWriter
		// instance : f1. f2
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data1.txt");
		f1.write("Hello1");
		f1.write("java1");
		
		FileWriter f2 = new FileWriter("data2.txt");
		f1.write("Hello2");
		f1.write("java2");
		f2.close();
		
		f1.write("!!");
		f1.close();
		
	}

}
/*
Math 클래스에서는 수학적 계산을 도와주는 여러 메소드를 포함하고 있다
이전에 사용했던 floor, ceil메소드 그리고 클래스의 필드(변수)로 pi등이 있다
이 외에도 자연상수E, 삼각함수, 제곱, 로그, 절대값, 난수, 반올림 등의 기능들을 할 수 있는
여러 메소드와 변수를 포함하고 있다.
-> 이러한 메소드와 변수는 인스턴스를 생성하지 않더라도 클래스에서 직접적으로 호출할 수 있다.

FileWriter클래스는 파일을 열어서 원하는 내용을 입력할 수 있는 기능들을 제공한다
그래서 각각의 파일에 해당하는 인스턴스를 생성하여 write메소드로 쓰기 작업을 수행하고
close메소드로 파일을 닫는다.
-> 이러한 메소드와 변수는 인스턴스를 생성하여 사용하여야 하고 클래스에서 직접적으로
호출할 수 없다.
 */




/*
 1) 클래스와 인스턴스에 대해서 알게 된 것
 - math라는 클래스는 바로 사용할 수 있고, filewriter도 클래스이지만 new를 추가해서 f1이라는 변수에 담기는 복제본을 생성했고,
   그 복제본은 내부적으로 data.txt라는 파일에 내용을 저장하겠다라는 상태!
 
 
 2) 왜 어떤 변수와 메소드들은 클래스에서 직접 호출하여 사용하고, 어떤 것들은 인스턴스를 생성해서 사용할까?
 - math.pi나 math.floor는 내부적으로 어떤 상태를 계속 유지할 필요없음. 필요할 때마다 쓰면 되는 일회용이다!
   하지만 FileWriter클래스는 writing 작업을 계속해서 추가할 수 있음. f1은 fileWriter의 복제본으로 긴 작업들을 해내갈 수 있음.
   
 - 짧게 작업을 끝내면 되는 것은 그냥 메소드나 변수를 클래스에 소속된 것 그대로 사용하지만, 긱 작업인 경우에는 클래스를 직접
	사용하는 것이 아니라 클래스를 복제해서 f1이라는 변수를 제어!
   
 3) 인스턴스를 생성할 수 없는 클래스도 있을까?
 - 있다! 'private'을 사용하면 다른 클래스에서는 이 녀석을 사용하지 못한다
 */












