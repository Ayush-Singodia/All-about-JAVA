import java.util.Scanner;

public class fun5{

    // Let's talked about passing parameters (string functions)

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String inputName=scn.nextLine();
        
        String personalised = mygreet("Aayush Saini");
        System.out.println(personalised);




    }

    static String mygreet(String name){
        String message = "Hey" + name;
        return messsage;
    }
}
