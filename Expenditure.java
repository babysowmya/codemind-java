import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(a>=(b*30))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}