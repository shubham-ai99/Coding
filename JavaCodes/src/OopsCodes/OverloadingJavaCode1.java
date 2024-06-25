package OopsCodes;

public class OverloadingJavaCode1 {

    public void abc(int a, int b){
        System.out.println( a + b);
    }
    public void abc(double a, double b){
        System.out.println( a + b);
    }

    public static void main(String[] args) {
       OverloadingJavaCode1 obj = new OverloadingJavaCode1();
        obj.abc(2,2);
        obj.abc(2.2,2.2);
    }
}
