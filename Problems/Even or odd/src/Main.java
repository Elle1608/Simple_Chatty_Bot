import  java.util.Scanner;


class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();*/
        //int n = scanner.nextInt();


        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                if (num == 0) {
                    break;
                }
                System.out.println("even");
            }  else if (num % 2 != 0) {
                System.out.println("odd");
            } else   continue;
        }




    }
}