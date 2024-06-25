package OopsCodes;


public class OverloadingJavaCode2 {

        public void abc(int a, int b){
            System.out.println( a + b);
        }
        public void abc(int a, int b, int c){
            System.out.println( a + b + c);
        }

        public static void main(String[] args) {
            OopsCodes.OverloadingJavaCode2 obj2 = new OopsCodes.OverloadingJavaCode2();
            obj2.abc(2,2);
            obj2.abc(2,2,2);

            OverloadingJavaCode1 obj1 = new OverloadingJavaCode1();
            obj1.abc(2.2,2.2);
        }
    }


