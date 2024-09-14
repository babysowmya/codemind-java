import java.util.Scanner;
class ArrayExample4 {
    public static void main(String[] args)
    {
        //An array of integers
        int[] arr = {10,20,30,40,50};
        for(int eachValue: arr)
        {
            System.out.println(eachValue);
        }
        // An array of strings
        String[] stringArray = {"tokyo","rio","berling"};
        for(String eachEle: stringArray)
        {
            System.out.println(eachEle);
        }
        //An array of characters
        char[] charArray = {'x','y'};
        for(char eachVar: charArray)
        {
            System.out.println(eachVar);
        }
        //An array of boolean values
        boolean[] boolArray = {false,true,false,false};
        for(boolean eachElement: boolArray)
        {
            System.out.println(eachElement);
        }
    }
}
