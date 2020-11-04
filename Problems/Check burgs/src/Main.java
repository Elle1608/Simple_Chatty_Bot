import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        boolean start = word.endsWith("burg");

        System.out.print(start);
    }
}