import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

//print a given name in a function

public class sum {
    public static void main(String[] args) {

        sum();
        multi();

    }

    static void sum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of  number1 and number2 is =" + sum);

    }

    static void multi(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        
        System.out.println("Enter the second number");
        int b=sc.nextInt();

        int multi=a*b;
    
        System.out.println("The multipication a and b is =" +multi);

    }

}
