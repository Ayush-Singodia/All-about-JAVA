import java.util.Scanner;

public class fifth {
    public static void main(String[]args)
    {
        //remainder using some conditional statements

        System.out.println("Enter the number you want to check even or odd:\n");

        Scanner scn = new Scanner(System.in);

        int x= scn.nextInt();

        if(x%2==0)
        {
            System.out.println("Your enterd number is even\n");
        }
        else
        {
            System.out.print("Your enterd number is odd\n");
        }
    }
}
