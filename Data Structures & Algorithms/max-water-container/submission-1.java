class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length; 
        int l = 0, r = n-1, ans = -1;
        while(l < r ){ 
            ans = Math.max(Math.min(heights[l], heights[r])*(r - l  ) , ans ); 
            if(l < r-1 && heights[l] < heights[r])l++; 
            else r--; 
        }
        return ans; 
    }
}
