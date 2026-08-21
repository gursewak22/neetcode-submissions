class Solution {
    public int longestConsecutive(int[] nums) {
        
        int len = 1 , n=nums.length , maxlen = 1 ; 
        if(n == 0 )return 0; 
        Arrays.sort(nums); 
        for(int i = 1 ; i < n ; ++i){ 
            if(nums[i] == nums[i-1])continue;
            if(nums[i] -1 == nums[i-1] ){
                len++; 
                maxlen = Math.max(maxlen , len);
            }
            else len =1; 
        }
        return maxlen; 
    }
}
