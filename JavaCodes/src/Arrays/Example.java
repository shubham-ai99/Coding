package Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);

        //Square
        List<Integer> square = list.stream()
                .map(n-> n*n)
                .collect(Collectors.toList());

        System.out.println(square);

        //Filtering
        System.out.println("******* filter *********");

        List<String> names = Arrays.asList("John", "Sena", "jack", "Roy");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J") || name.startsWith("j"))
                .collect(Collectors.toList());

        System.out.println("filteredNames start with J :" + filteredNames);


        //Mapping
        System.out.println("************ map ************");

        List<String> mapNames = Arrays.asList("Jo", "Jane", "Jacky");
        List<Integer> nameLengths = mapNames.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("nameLengths : " + nameLengths);


        //sorted

        System.out.println("*********** stream.sorted *********");

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println("sortedNumbers : " + sortedNumbers);


        //reduce
        System.out.println("*******8 reduce ********");
        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numberss.stream()
                .reduce(0, Integer::sum);
        System.out.println("sum" + sum);

        //collecting
        System.out.println("********* collect ******");

        List<String> names1 = Arrays.asList("John", "Jane", "Jack", "Jane","John","Roy");
        Set<String> nameSet = new HashSet<>(names1);
//        List<String> nameSet = names1.stream()
//                .collect(Collectors.toList()); //for employy class
        System.out.println("nameSet" + nameSet);

        //forEach
        List<String> names2 = Arrays.asList("John", "Jane", "Jack");
         names2.stream().forEach(System.out::println);

         //Any match
        List<String> inputString = Arrays.asList("John", "Jane", "Jack");
        boolean anyStartsWithJ = inputString.stream()
                .anyMatch(name -> name.startsWith("J"));
        System.out.println("anyStarts With J : " + anyStartsWithJ);


        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        long count = numbers5.stream().count();
        System.out.println("count : " + count);



    }
}
