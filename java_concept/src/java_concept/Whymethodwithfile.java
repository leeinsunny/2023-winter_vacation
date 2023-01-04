package java_concept;

import java.io.FileWriter;
import java.io.IOException;

public class Whymethodwithfile {

	public static void main(String[] args) throws IOException {
		String out = twoTimes("a","-");
		System.out.println(out);
		FileWriter fw = new FileWriter("out.txt");
		fw.write(out);
		fw.close();
		System.out.println(twoTimes("a","*"));

	}
	
	public static String twoTimes(String text, String delimiter) {
		String out ="";
		out = out+delimiter+"\n";
		out = out+text+"\n";
		out = out+text+"\n";
		return out;
	}

}
/*
메소드가 데이터를 반환하도록 만들기 위해서는 그렇지 않은 메소드에 비해 몇가지 구성요소가 필요하다
1. 반환되는 데이터 타입
2. return

반환되는 데이터의 타입은 메소드의 이름 앞에 넣어서
이 메소드가 그 데이터 타입을 반환한다는 것을 명시한다
만약 메소드가 아무것도 반환하지 않는다면 void를 넣어둔다
그리고 우리가 작업을 처리한 후 반환하고자 하는 데이터를 'return 반환값'형식으로 입력하여
메소드가 데이터를 반환하도록 한다.
그리고 return이 실행된 후에는 그 뒤에 실행할 코드가 메소드에 남아 있어도 
더 처리하지 않고 바로 메소드를 빠져 나온다. 
*/