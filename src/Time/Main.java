package Time;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String input = "Ужин в 16:55 по Гринвичу";
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }

    }
}