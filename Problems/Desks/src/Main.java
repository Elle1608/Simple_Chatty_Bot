import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = (int) Math.ceil((float) scanner.nextInt() / 2);
        //float a = scanner.nextFloat();
        int b = (int) Math.ceil((float) scanner.nextInt() / 2);
        //float c = scanner.nextFloat();
        int c = (int) Math.ceil((float) scanner.nextInt() / 2);


        int sum1 = (a + b + c);


        System.out.println(sum1);




    }
}