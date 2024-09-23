public class Add {
    //A function which accepts N numder of integers
    static void add(int ... nums)
    {
        // nums is an integer array
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        System.out.println(sum);
    }   
    public static void main(String[] args) {
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(10,20,30,40,50);
    }
}
