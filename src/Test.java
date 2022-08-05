public class Test {
    public static void main(String[] args) {
        int[] testArray = new int[101];
        int[] nums = {1,1,1,1};
        System.out.print(nums);
        for(int n: nums) {
            testArray[n]++;
        }
        System.out.println(testArray);
    }
}
