import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
            int k = scanner.nextInt();

            int a = k/100; //4
            int n = (k%100); //76
            int b = n/10;//7
            int c = k%10; //6

            int sum = (a + b + c);
            System.out.println(sum);
    }
}