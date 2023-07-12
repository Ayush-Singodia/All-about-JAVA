import java.util.Scanner;

public class fun2 {
 
    //Function program if a function returns some value's
    public static void main(String[] args) {

        int ans = sum2();
        System.out.println(ans);

    }

    // return the value
    static int sum2() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scn.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scn.nextInt();

        System.out.println("Enter the Second number");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is =" + sum);

    }

}
