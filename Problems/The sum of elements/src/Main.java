import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;


        while (num != 0) {
            sum += num;
            num = scanner.nextInt();
        }
        System.out.println(sum);

    }
}