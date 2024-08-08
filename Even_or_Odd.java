import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}