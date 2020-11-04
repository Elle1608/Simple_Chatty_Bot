import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        //Scanner q = new Scanner(System.in);

        //int aa = q.nextInt();
        //int n = q.nextInt();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int max = 0;

        while (n % 4 == 0) {
           if (n > max) {

                max = n;
               System.out.print(n);
               max++;
                //break;
           }

        }



    }
}

