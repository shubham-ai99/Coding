package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayWithString2 {

    public static void main(String[] args) {
        ArrayList<String> obje = new ArrayList<>();

        obje.add("Shubham");
        obje.add("Mangesh");
        obje.add("Arikshit");

        Collections.sort(obje, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare the first characters of the strings
                return Character.compare(s1.charAt(0), s2.charAt(0));
            }
        });

        System.out.println("Collections method sort by alphabet  :  ");
        for (String i : obje) {
            System.out.println(obje);
        }

        System.out.println("****************************");
        obje.add("Uday");
        obje.add("Surya");
        obje.add("Gaurav");
        Collections.sort(obje, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Character.compare(o1.charAt(0), o2.charAt(0));
            }
        });

        for (String i : obje) {
            System.out.println(i);
        }

        System.out.println("***** Start with S ******");

        System.out.println("print string start with S");

        ArrayList<String> result = new ArrayList<>();
        for (String i : obje) {
            if (i.startsWith("S")) {
                result.add(i);
            }
            System.out.println(result);
        }
    }
}


//        String name1= obje.get(0);
//        String name2= obje.get(1);
//        String name3= obje.get(2);
//        int size = obje.size();
//        System.out.println(obje.clone());
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(size);

//        System.out.println("Collections method sort");
//        System.out.println("***********************************************************************");

