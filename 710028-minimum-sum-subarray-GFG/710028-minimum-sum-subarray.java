class Solution {
    public int minSubarraySum(int[] arr) {
        
        int prev = arr[0];
        int ans = arr[0];
        int best = arr[0];
        
        for(int i=1;i<arr.length;i++){
            prev = best + arr[i];
            int curr = arr[i];
            best = Math.min(prev,curr);
            ans = Math.min(ans,best);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna