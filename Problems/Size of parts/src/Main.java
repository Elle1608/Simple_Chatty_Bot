import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner q = new Scanner(System.in);


        int n = q.nextInt();
        int larger = 1;
        int perfect = 0;
        int smaller = -1;

        int numLarger = 0;
        int numPerfect = 0;
        int numSmaller = 0;

        for (int i = 0 ; i < n; i++){
            int part = q.nextInt();

            if (part == larger) {
                numLarger++;
            } else if (part == smaller) {
                numSmaller++;
            } else if (part == perfect) {
                numPerfect++;
            }
        }

        System.out.println(numPerfect + " " + numLarger + " " + numSmaller);

    }
        }


