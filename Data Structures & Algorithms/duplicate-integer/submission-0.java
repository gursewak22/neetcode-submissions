class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for(int num: nums){
            if(s1.contains(num))return true;
            s1.add(num); 
        }
        return false;
    }
}