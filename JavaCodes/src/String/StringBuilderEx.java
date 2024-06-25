package String;

public class StringBuilderEx {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);

        sb.insert(6, "Java ");
        System.out.println(sb);


        System.out.println("***********************  1  ******************************");


        StringBuilder stringBuilder = new StringBuilder();

        // Concatenate strings efficiently using StringBuilder
        stringBuilder.append(" Hello");
        stringBuilder.append(" Java ");
        stringBuilder.append("World ");

        System.out.println(stringBuilder);
        // Convert StringBuilder to String
        String result = stringBuilder.toString();
        // Print the concatenated string
        System.out.println(result); // Output: Hello World

        //Trim op
        String trimmed = result.trim();
        System.out.println(trimmed);



        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World



    }
}
