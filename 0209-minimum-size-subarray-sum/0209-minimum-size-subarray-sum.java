class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int temp = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
            while (temp >= k) {
                int remove = arr[left];
                temp = temp - remove;
                ans = Math.min(ans, i - left + 1);
                left++;
            }


        }

        if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna