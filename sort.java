import java.util.Arrays;
class sort {
    public static void main(String[] args) {
        int[] nums = {5,1,4,2};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
        String[] names = {"tokyo","Profesor","rio"};
        Arrays.sort(names); // sorting in-place
        System.out.println(Arrays.toString(names));
    }
}
