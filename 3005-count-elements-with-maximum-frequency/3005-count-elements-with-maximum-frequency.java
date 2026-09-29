class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer, Integer> check = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!check.containsKey(arr[i])) {
                int count = 1;
                check.put(arr[i], count);
            } else {

                check.put(arr[i], check.get(arr[i]) + 1);

            }
        }

        int max = 0;
        for (int i = 0; i <arr.length; i++) {
            if (check.get(arr[i]) > max) {
                max = check.get(arr[i]);

            }
        }

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (check.get(arr[i]) == max) {
                ans = ans + 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna