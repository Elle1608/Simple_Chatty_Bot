import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt(); //чашки арахисового масла
        boolean b = scanner.nextBoolean(); //считывает значение после кружки, true - выходной, false - будний;
        boolean w = true; // выходной или нет

        if (((num >= 10 && num <= 20) && !b) || ((num >= 15 && num <= 25) && b))
        /*
        правда, если кружек 10-20 и будний или правда, если 15-25 кружек и выходной.
        */
        {
            System.out.println(true); //если правда, то вывод
        }

        else
        {
            System.out.println(false); // если хоть одно условие не работает, то вывод
        }



        }
}