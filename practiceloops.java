import java.util.Scanner;

//find the sum of firts n natural numbers!!

public class prloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + 1;
        }
        System.out.println(sum);
    }

}
