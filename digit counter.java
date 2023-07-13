import java.util.Scanner;

public class digitcounter {

    // Digit counter program ,which counts the digits in a number
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scn.nextInt();

        int ans = countdigits(x);
        System.out.println(ans);

    }

    static int countdigits(int x) {

        int res = 0;
        while (x > 0) {
            x = x / 10;
            res++;
        }
        return res;

    }
}
