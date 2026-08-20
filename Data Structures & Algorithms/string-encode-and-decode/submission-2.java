class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
       
        for(int i= 0 ;i < strs.size()  ; ++i){ 
            String s = strs.get(i); 
            sb.append(s.length()).append('#').append(s); 
            
        }
 
        return sb.toString(); 
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>(); 
        int idx = 0 ; 
        while(idx < str.length()){
            int len = 0 ; 
            while(str.charAt(idx) != '#'){
                len =  len*10 + (str.charAt(idx) - '0');    
                idx++; 
            }

        
            String s = str.substring(idx +1 , idx + len +1 ); 
            res.add(s);
            idx = idx + len +1 ; 
        }
        return res;
    }
}
