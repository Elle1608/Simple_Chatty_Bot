package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in Oct 2020.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        int count = scanner.nextInt();

        for(int i = 0; i <= count; i++){

            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge. \n Why do we use methods? \n 1. To repeat a statement multiple times. \n 2. To decompose a program into several small subroutines. \n 3. To determine the execution time of a program. \n 4. To interrupt the execution of a program.");

        for (int i = 1; i < 5; i++) {

            int answer = scanner.nextInt();

            if (answer == 1 || answer == 3 || answer == 4) {
                System.out.println("Please, try again.");

            } else  {
                break;
            }
        }

        System.out.println("Congratulations, have a nice day!");
    }
}
