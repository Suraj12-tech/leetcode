class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int best = arr[0];
        int minbest = arr[0];
        int ans = Math.abs(arr[0]);

        for(int i=1;i<arr.length;i++){
            int prev = best+arr[i];
            int curr = arr[i];

            best= Math.max(prev,curr);
            minbest=Math.min(minbest + arr[i],curr);
            ans = Math.max(ans ,Math.max(Math.abs(best),Math.abs(minbest)) );

        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna