/**
 * Homework04
 * 编写类A03,实现数组的复制功能copyArr，
 * 输入旧数组，返回一个新数组，元素和旧数组一样。Homework04.java
 */
public class Homework04 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 8, 9};
        int[] new_nums = A03.copyArr(nums);
        for (int i = 0; i < new_nums.length; i++)
            System.out.print(new_nums[i] + " ");
    }
}

class A03 {
    public static int[] copyArr(int[] nums) {
        int[] new_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            new_nums[i] = nums[i];
        }
        return new_nums;
    }
}