class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> h1 = new HashSet<>();
        for(int num: nums)h1.add(num); 
        int maxlen = 0 ;
        for(int num: h1 ){ 
            if(!h1.contains(num-1)){
                int len = 1; 
                while(h1.contains(num + len))len++;
                maxlen = Math.max(len, maxlen); 
            }
        }
        return maxlen; 
    }
}
