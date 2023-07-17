import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        palin();

    }
    
    static void palin(){
        int r,sum=0,temp;

        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        temp=n;
        while(n>0){
            r=n%10; // getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
        System.out.println("Given number is palindrome");
        else
        System.out.println("Not Palindromic Number!");
        

    }
}
