public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Solution0001 so = new Solution0001();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = so.twoSum(nums, target);
        System.out.println(res);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
