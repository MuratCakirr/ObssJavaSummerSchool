public class Main {

    public static int[] reverse(int[] nums){

        int[] nums1 = new int[nums.length];

        for (int i = nums.length-1; i >= 0 ; i--) {
            nums1[nums.length-1-i]=nums[i];
        }

        return nums1;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,8,10,9};
        for ( int number: reverse(numbers)) {
            System.out.println(number);
        }
    }
}
