class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> m1 = new HashMap<>(); 
        for(String s: strs ){
            char[] arr =s.toCharArray(); 
            Arrays.sort(arr);
            String key = new String(arr); 
            
            m1.computeIfAbsent(key, x -> new ArrayList<>()).add(s); 
            // m1.getOrDefault(key , new ArrayList<>()).add(s); 
        }
        List<List<String>> ans = new ArrayList<>(); 
        return new ArrayList<>(m1.values()); 
    }
}
