import java.util.*;

public class Solution{
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;


    }





    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = x.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = x.nextInt();
    }

    System.out.println(containsDuplicate(nums));
}
}
