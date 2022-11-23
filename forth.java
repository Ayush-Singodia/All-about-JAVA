//This basic code helps you to understand about how to take a integar input from the user
import java.util.Scanner;

public class in {

  public static void main(String[] args) {
    System.out.println("Enter the number\n");
    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      System.out.println("Your enterd number is:\n");
      System.out.println(a);
    }

  }
}
