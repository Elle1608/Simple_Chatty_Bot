import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        double aa = scanner.nextDouble();
        double bb = scanner.nextDouble();

        double res = 0; // сумма/кол-во.
        double sum = 0; //сумма всех чисел, которые делятся на 3.
        double count = 0; // кол-во чисел, делящихся на 3.


        for (double i = bb; i >= aa; i-- ) {

            if (i % 3 == 0) {

                count++;
                sum += i;
                } else  {

            }

        }
        res = sum/count;
        System.out.println(res);
    }
}