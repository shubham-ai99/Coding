package ArrayList;
import java.util.ArrayList;


/*
    Question:
    Input ArrayList : [1, 2, 3, 4]

    Solution: -->
    Expected Output Arraylist : [1, 2, 3, 4, 1, 2, 3, 4]

 */
public class ArrayListAdd {


    public static void main(String[] args) {

        ArrayList<Integer> age = new ArrayList<>();

        age.add(1);
        age.add(2);
        age.add(3);
        age.add(4);

        ArrayList<Integer> age2 = new ArrayList<>();


        for (int i = 0; i < age.size(); i++) {
            age2.add(age.get(i));
        }
        for (int i = 0; i < age.size(); i++) {
            age2.add((i + age.size()), age.get(i));
        }
        System.out.println(age2);
    }
}
