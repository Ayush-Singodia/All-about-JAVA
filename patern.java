import java.util.Scanner;

//print a solid rectangle using loops

public class patrnloop1 {
    public static void main(String[]args){

      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter the value of n and m");
      int n=sc.nextInt();
      int m=sc.nextInt();

      for(int i=1; i<=n; i++ )
      {
        for(int j=1; j<=m; j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
    }
    
}
