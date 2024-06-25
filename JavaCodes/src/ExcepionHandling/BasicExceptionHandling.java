package ExcepionHandling;

public class BasicExceptionHandling {

    //Arithmetic Exception
    public static void main(String[] args) {


        try {

            int salary = 80000/0;

            System.out.println(salary);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }


        //NullPointerException
        try {
            String s=null;
            System.out.println(s.length());
        }catch(NullPointerException n){
            System.out.println(n);
        }



    }



}
