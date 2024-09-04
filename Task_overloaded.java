public class Task_overloaded {
    static void  printArrayElements(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]);
        }
    }
    static void printArrayElements(double b[])
    {
         for(int i=0;i<b.length;i++)
         {
            System.out.println(b[i]);
         }
    }
    static void printArrayElements(String str[])
    {
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
    static void printArrayElements(char[] d)
    {
        for(int i=0;i<d.length;i++)
        {
            System.out.println(d[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = {10,20,30};
        double[] b = {12.2,23.4,15,1};
        String[] str = {"Hello","java"};
        char[] d = {'a','b','c','d'};
        printArrayElements(a);
        printArrayElements(b);
        printArrayElements(str);
        printArrayElements(d);
    }
}
