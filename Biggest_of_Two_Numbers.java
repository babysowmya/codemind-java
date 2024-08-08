import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(a>b)
        {
            System.out.printf("%d",a);
        }
        else
        {
            System.out.printf("%d",b);
        }
    }
}