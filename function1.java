import java.util.Scanner;


class addition{
    int sum=0;
    public int addtwoInt(int a, int b){
    sum=a+b;
    return sum;
    }
}



class fun{
    public static void main(String[]args){
    addition add=new addition();
    int s=add.addtwoInt(1, 3);

    System.out.println("sum of two number is:" +s);

    }
}
