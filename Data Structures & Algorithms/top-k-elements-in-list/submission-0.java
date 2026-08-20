class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length; 
        HashMap<Integer, Integer> m1 = new HashMap<>(); 
        for(int num: nums){ 
            m1.put(num, m1.getOrDefault(num,0) + 1 );    
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] -a[1]); 
        for(Map.Entry<Integer, Integer> entry: m1.entrySet() ){
            int[] temp = new int[2];
            temp[0] = entry.getKey();
            temp[1] = entry.getValue();
            pq.add(temp);
        } 
        int[] res = new int[k];
        for(int i = 0; i< k; ++i){
            res[i] = pq.poll()[0];
        }
        return res; 
    }
}
