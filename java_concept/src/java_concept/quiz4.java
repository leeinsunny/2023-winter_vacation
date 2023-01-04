package java_concept;

/*class Parent {
    public Parent() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("Child");
    }
}


public class quiz4 {

	public static void main(String[] args) {
	     Child c = new Child();
	}
}*/

class Calc {
    public int run(int a, int b) {
        return a + b;
    }
}
class MyCalc extends Calc {
    public int run(int a, int b) {
        return a - b;
    }
}

public class quiz4
{
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        System.out.println(myCalc.run(100, 10));
    }
}
