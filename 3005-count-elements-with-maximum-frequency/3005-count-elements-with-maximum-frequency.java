class Solution {
    public int maxFrequencyElements(int[] arr) {

        HashMap<Integer, Integer> check = new HashMap<>();

        // Frequency count
        for (int i = 0; i < arr.length; i++) {

            if (!check.containsKey(arr[i])) {
                check.put(arr[i], 1);
            } else {
                check.put(arr[i], check.get(arr[i]) + 1);
            }
        }

        // Find maximum frequency
        int max = 0;

        for (int value : check.values()) {
            if (value > max) {
                max = value;
            }
        }

        // Add all frequencies equal to max
        int ans = 0;

        for (int value : check.values()) {
            if (value == max) {
                ans = ans + value;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna