import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        boolean start = word.contains("J")|word.contains("j");

        System.out.print(start);

    }
}