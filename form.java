import java.util.Scanner;

class thrid {
    public static void main(String[] args) {
        System.out.println("Welcome to hotel residency\n");
        System.out.println("Enter your basic details here\n");

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name here\n");
        String name = scn.next();
        System.out.println("Your enterd name is\n" + name);


        System.out.println("Enter your age\n");

        int x = scn.nextInt();

        // print integer
        System.out.println("Your enterd age is :\n " + x); 

       

        System.out.println("Enter your adress here\n");
        String address = scn.nextLine();
        // print string
        System.out.println("your enterd adress is \n" + address);

        System.out.println("Enter your mobile number\n");
       
        int number = scn.nextInt();

        // print integer
        System.out.println("Your enterd age is :\n " + number); 
    }
}
