import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;



        while (Math.sqrt(i) <= n) {

            System.out.println(i);
            i++;
        }

        }
    }
