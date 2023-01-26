import java.util.Scanner;

class whil{
    public static void main(String[]args)
    {    System.out.println("Enter a number\n");
        Scanner scn=new Scanner(System.in);
        int money=scn.nextInt();
       
        while(money<15)
        {
            System.out.println("hey i;m while loops example\n");
            money++;

        }
    }
}
