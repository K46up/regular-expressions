package Time;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст ");
        String input = scanner.nextLine();

        Time.Time(input);
    }
}