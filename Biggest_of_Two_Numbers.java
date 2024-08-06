import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a,b;
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