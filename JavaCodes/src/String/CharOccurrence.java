package String;

public class CharOccurrence {

    public static void main(String[] args) {

        String str = "ababaca ";
        char[] ch = str.toCharArray();
        int length = str.length();
        int count = 0;
        for (int i =0; i<= length-2; i++) {
            for (int j=i+1; j<= length-1; j++) {

                System.out.print(ch[i]);
            }
        }
    }
}
