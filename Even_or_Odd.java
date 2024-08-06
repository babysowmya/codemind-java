import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a;
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