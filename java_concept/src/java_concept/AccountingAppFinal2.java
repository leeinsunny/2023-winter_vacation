package java_concept;
/*
AccountingAppFinal은 클래스화, 즉 클래스만 사용해서 만들었음
근데 이제 클래스말고 인스턴스를 이용해서 문제를 풀어보려고 그럼

<인스턴스화>
클래스 하나만 가지고 문제를 푼다면, 공급가액이나 부가가치 세율이 다르면 그때마다 일일이 필드를 수정해야함
인스턴스를 이용하면 각각의 인스턴스는 서로에게 영향을 미치지 않기 때문에
독립적으로 작업을 처리하게 만들 수 있음.
*/
class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1;
    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingAppFinal2 {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
         
        Accounting a2 = new Accounting(20000.0);
         
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
         
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
         
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
         
  
    }
}