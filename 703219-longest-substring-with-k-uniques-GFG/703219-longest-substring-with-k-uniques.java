class Solution {
    public int longestKSubstr(String s, int k) {
        int left = 0;
        int max = 0;
        int ans =-1;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int right = 0;right< s.length();right++){
            char ch = s.charAt(right);
            
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            
            while(map.size()>k){
                char remove = s.charAt(left);
                
                map.put(remove,map.get(remove)-1);
                if(map.get(remove)==0){
                    map.remove(remove);
                }
                
                left++;
            }
            
            if(map.size()==k){
                
                max = right-left+1;
                ans = Math.max(ans,max);
            }
            
            
        }
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna