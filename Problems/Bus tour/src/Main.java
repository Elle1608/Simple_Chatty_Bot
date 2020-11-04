import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);

        int hgt = q.nextInt(); // высота автобуса
        int bri = q.nextInt(); // число мостов
        int i = 1; // счетчик мостов


        boolean crash = false; // задаем переменную краш, при которой точно произойдет столконовение.
        for (; i < bri; i++) { // начинаем счетчик.
            // Нужно помнить о том, что в цикл помещаются те действия, которые должны циклиться, до этого у тебя не получилось)
            int heightOfTheBridge = q.nextInt();
            if (hgt >= heightOfTheBridge) {
                crash = true;
// если высота автобуса больше или равно высотке моста, то будет авария, собственно переменная краш становится - тру.
// Если авария произошла, то нужно сделать выход их программы, поэтому брейк.
                break;
            }
        }
        if (crash) { // теперь делаем вывод программы..
            System.out.println("Will crash on bridge " + i);
        } else {
            System.out.println("Will not crash");
        }
    }
}