import java.util.*;

class Solution{
	public static void twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int i = 0;
            map.put(nums[i],i);
            i++;
        }
        for(int i=0; i < nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                System.out.println(complement);
            }
        }
       
    	}
	
	public static void main(String[] args){
		int[] test = {1,2,3,4,6,7};
		twoSum(test,10);

	}
}
