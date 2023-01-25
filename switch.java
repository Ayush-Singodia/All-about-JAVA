
import java.util.Scanner;

public class eight{
    public static void main(String[]args)
    {
        System.out.println("Enter a button number\n");
        Scanner scn=new Scanner(System.in);
        int button=scn.nextInt();
        
        switch(button)
        {
            case 1:
            System.out.println("hey congo u won a laptop\n");
            break;

            case 2:
            System.out.println("hey congo u won a smartphone\n");
            break;

            case 3:
            System.out.println("hey you won a buggy\n");
            break;

            default:System.out.println("Sorry you won nothingg!!!\n");

        }
    

    }
}
