import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] count = new int[10];
        int[] nums = {8,1,2,2,3};
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 1 ; i < 10; i++) {
            count[i] += count[i-1];
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }
        System.out.println(Arrays.toString(res));
    }}