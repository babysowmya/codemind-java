import java.util.Scanner;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args)
    {
        int x1,y1,x2,y2;
        Scanner read = new Scanner(System.in);
        x1=read.nextInt();
        y1=read.nextInt();
        x2=read.nextInt();
        y2=read.nextInt();
        double z;
        z=Math.sqrt(((x2-x1)*(x2-x1))+(y2-y1)*((y2-y1)));
        System.out.printf("%.4f",z);
    }
}
