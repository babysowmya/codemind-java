import java.util.Arrays;
class arrayfill {
    public static void main(String[] args) {
        int a[] = new int[5];
        Arrays.fill(a,-1); // Fill with -1
        System.out.println(Arrays.toString(a));
        String[] names = new String[10];
        Arrays.fill(names,"Sowmya"); // Fill with Sowmya
        System.out.println(Arrays.toString(names));

        char[] characters = new char[10];
        Arrays.fill(characters,2,5,'z'); // index 2 to 4 with 'z'
        System.out.println(Arrays.toString(characters));
        Arrays.fill(characters,5,10,'s');// inde 5 to index 9 with 's'
        System.out.println(Arrays.toString(characters));

        boolean boolArray[] = new boolean[100];
        Arrays.fill(boolArray,false);
        System.out.println(Arrays.toString(boolArray));
    }
}
