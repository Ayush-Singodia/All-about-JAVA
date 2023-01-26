import java.util.Scanner;

class forloop{
    public static void main(String[]args)
    {   System.out.println("Enter a number how much time you want to:\n");
        Scanner scn=new Scanner(System.in);
         int a;
        int b=scn.nextInt();
        for(a=0; a<b; a++)
        {
            System.out.println("Hello this is the basic of for loops\n");
        }
    }
}
