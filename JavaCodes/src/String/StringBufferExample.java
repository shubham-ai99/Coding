package String;
import java.lang.StringBuffer;
import java.sql.SQLOutput;
import java.util.SortedMap;


public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer buffer = new StringBuffer("Hello");

        // Append more characters to the buffer
        buffer.append(" World");

        // Insert characters at a specific position
        buffer.insert(5, ", ");

        // Replace characters in the buffer
        buffer.replace(0, 5, "Greetings");

        // Delete characters from the buffer ....it will delete , and space in this example
        buffer.delete(9, 11);

        // Print the contents of the buffer
        System.out.println(buffer); // Output: Greetings, World


        System.out.println("************************************");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("hello");
        sb2.append("Guys");
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder();
        sb3.append(10);
        sb3.append(20);
        System.out.println(sb3.toString());
    }
}
