package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDatePatternMatch {

    public static void main(String[] args) {
        String dateString = "2024-05-07";
        Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher matcher = pattern.matcher(dateString);
        if (matcher.matches()) {
            String year = matcher.group(1);
            String month = matcher.group(2);
            String day = matcher.group(3);
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        }
    }
}
