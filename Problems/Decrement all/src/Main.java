import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int sum_num1 = --num1;
        int sum_num2 = --num2;
        int sum_num3 = --num3;
        int sum_num4 = --num4;

        System.out.print(sum_num1 + " " + sum_num2 + " " + sum_num3 +  " " + sum_num4);
    }
}