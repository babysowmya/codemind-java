import java.util.Arrays;
class Binarysearch {
    public static void main(String[] args) {
         int[] [] arr = {{10 ,20, 30},{40,50,60},{70,80,90}};
         System.out.println(arr[0][0]); //10
         System.out.println(arr[1][2]); //60
         // nested loop
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j] + " ");
            }      
            System.out.println();
         }
    }
}
