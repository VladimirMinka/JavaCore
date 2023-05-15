package Lesson;

import java.util.Arrays;

public class Lesson_Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 56, 3, 88, 90, 34, 78, 77, 88, 12, 45};
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        int[] nums = new int[20];
        Arrays.fill(nums, 20);
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        int[] nums3 = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println(Arrays.equals(numbers, numbers2));
        //Arrays.sort(numbers);
        Arrays.parallelSort(numbers, 4, numbers.length);

        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println(Arrays.binarySearch(numbers, 78));
        int[] num = new int[numbers.length];
        System.arraycopy(numbers, 0, num, 0, num.length);
        System.out.println(Arrays.toString(num));


        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(numbers));

    }
}
