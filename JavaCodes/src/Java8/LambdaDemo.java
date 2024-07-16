package Java8;

interface I{
    void show();

}

class Abc implements I{
    @Override
    public void show(){
        System.out.println("Show() method Implementation : 1st way");
    }
}

public class LambdaDemo {

    public static void main(String[] args) {
        Abc abc = new Abc();
        abc.show();
        /*
        I a = new I() {
            @Override
            public void show() {
                System.out.println("Show() method Implementation : 2nd way");
            }
        };
        a.show();


         */

        I b = () -> {System.out.println("Lambda  : if only 1 method in interface you want define directly in class");};
        b.show();

        I c = () -> System.out.println("Lambda expression " );
        c.show();




    }

}
