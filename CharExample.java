import java.util.Scanner;
class CharExample{
       public static void main(String[] args)
        {
             Scanner read = new Scanner(System.in);
             // Reading a single character
             char ch = read.next().charAt(0);
             System.out.println(ch);
        }
}