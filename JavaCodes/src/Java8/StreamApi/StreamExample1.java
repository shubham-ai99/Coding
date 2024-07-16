package Java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<String> fruits = Arrays.asList("apple", "orange", "mango");

        List<Integer> result= list.stream().filter(i -> i%2 ==0).collect(Collectors.toList());

        System.out.println(result);


        Map<String,Integer> result1= fruits.stream().collect(Collectors.toMap(s-> s, String :: length));
    }

}
