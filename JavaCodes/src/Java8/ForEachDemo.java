package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {

        // Consumer is Functional Interface which having only one Method i.e. Accept() used for forEach()


        List<Integer> list1 = Arrays.asList(1,3,5,7);

        System.out.println("list" + list1);
        Consumer<Integer> in = i -> System.out.println(i);
         list1.forEach(in);

        System.out.println(" Another simple way below to traverse and print array List using Lambda:");

         list1.forEach(i -> System.out.println(i)); //###


        System.out.println("******************************************************************");

        List<Integer> list2 = Arrays.asList(1,3,5,7);

        System.out.println("list" + list2);
        list2.forEach(i -> System.out.printf(" indexOf : "+ " i is " + list2.indexOf(i) + "\n" ));



        System.out.println("*********** consumer ***********"  );
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println( + i );
            }
        };


        list2.forEach(c);

        System.out.println();






        System.out.println("********** InstanceOf() ***********************");

        String str = null;
        boolean result = str instanceof String;
        System.out.println("instaceOf() : " +result);


//        A a = new C();
//        System.out.println(a instanceof A);  // Output?
//        System.out.println(a instanceof B);  // Output?
//        System.out.println(a instanceof C);  // Output?


//        I i = new Y();
//        System.out.println(i instanceof I);  // Output?
//        System.out.println(i instanceof X);  // Output?
//        System.out.println(i instanceof Y);  // Output?
//


        System.out.println("\n List3 : ");

        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
        list3.forEach(i -> System.out.println(i));

    }
}
