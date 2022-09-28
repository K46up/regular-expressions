package Var_4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String input = "Зорин, Иванов, Петров, Сидоров";
        Pattern pattern = Pattern.compile("Иванов");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find())
            System.out.println("Иванов найден");
        else
            System.out.println("Иванов не найден");

    }
}
