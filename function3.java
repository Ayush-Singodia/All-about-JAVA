import java.util.Scanner;

// basic code for learning function basics using java

//main fucntion
public class summ {
public static void main(String[] args){
  //function calling using -function name();
    sum();

        
}
     //sum fucntion for adding two numbers
    static void sum(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=scn.nextInt();

        System.out.println("Enter the Second number");
        int num2=scn.nextInt();


        int sum=num1+num2;
        System.out.println("The sum is =" +sum);

    }
}
