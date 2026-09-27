class Solution {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] s1_char = s1.toCharArray();
        char[] s2_char = s2.toCharArray();

        Arrays.sort(s1_char);
        Arrays.sort(s2_char);
        for(int i=0;i<s1.length();i++){
                if(s1_char[i] != s2_char[i]){
                    return false;
                }
        }

        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna