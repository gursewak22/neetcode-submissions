class Solution {
    public int[] twoSum(int[] nums, int target) {
        // compare every number nˆ2 sort nlogn 2 pointer than n 
        // Arrays.sort(nums); 
        // int left =0 , right = nums.length -1; 
        // while(left < right){
        //     int sum = nums[left] + nums[right];
        //     if(sum == target)return new int[] {left, right}; 
        //     else if(sum > target)right--;
        //     else left ++; 
        // }
        // return new int[]{-1,-1}; 
        // fail becz we need original index
        HashMap<Integer, Integer> h1 = new HashMap<>(); 
        for(int i = 0; i < nums.length ; ++i ){
            int comp = target - nums[i]; 
            if(h1.containsKey(comp)){ 
                return new int[]{h1.get(comp), i};
            }
            else{
                h1.put(nums[i], i); 
            }
        }
        return new int[] {-1,-1}; 
    }
}
