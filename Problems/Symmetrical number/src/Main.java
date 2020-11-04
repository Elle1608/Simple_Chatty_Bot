import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        if (a == d & b == c) {
            System.out.println(1);
        }  else {
            System.out.println(37);
        }
    }
}
