
class Solution {
    public int maximumSum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int best = arr[0];
        int prev_check = 0;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prev = best + arr[i];
            int curr = arr[i];

            int past = prev_check + arr[i];

            prev_check = Math.max(past, best);
            best = Math.max(prev, curr);

            ans = Math.max(ans, Math.max(best, prev_check));
        }

        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna