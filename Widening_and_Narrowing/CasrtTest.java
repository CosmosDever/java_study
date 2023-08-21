package java_study.Widening_and_Narrowing;

public class CasrtTest {
    public static void main(String[] args) {
        //======= Widening Casting ================
    //Create an int
    int a = 9;
    // convert int to double
    double b = a;
    // Create an double
    double c = 9.8;
    // convert double to int
    int d = (int)c;
    System.out.println("Integer : " + a);
    System.out.println("After converting to double : " + b);
    System.out.println("Double : " + c);
    System.out.println("After converting to integer : " + d);
        
    }

}
