import java.util.Scanner;
public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int store = 0;

        boolean ascending = false;
        boolean descending = false;

        while ((input = scanner.nextInt()) != 0) {

            if (input == store || store == 0) {
                store = input;
                continue;

            } else if (input > store) {
                ascending = true;
                store = input;

            } else if (input < store) {
                descending = true;
                store = input;

            } else {
                continue;
            }
        } // while-loop

        if (ascending == false && descending == false) {
            System.out.println(true);

        } else {
            System.out.println(ascending ^ descending);
        }

    } // Methode
}