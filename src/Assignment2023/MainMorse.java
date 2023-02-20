package Assignment2023;

import java.util.Scanner;

public class MainMorse {
    public static void main(String[] args) {

        Logic logic = new Logic();
        Scanner scan = new Scanner(System.in);

        System.out.println("Write something you will translate in morse or english");
        String input = scan.nextLine();

        while (input != null && !input.trim().isEmpty()) {
            String translation = logic.Translate(input);
            System.out.println(translation);

            System.out.println("Write something you will translate in morse or english");
            input = scan.nextLine();
        }
    }
}