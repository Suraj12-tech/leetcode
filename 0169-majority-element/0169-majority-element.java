class Solution {
    public int majorityElement(int[] arr) {
        int current = arr[0];
        int vote = 1;
        for (int i = 1; i < arr.length; i++) {
            if (vote == 0) {
                current = arr[i];
                vote++;
            } else if (vote != 0 && current == arr[i]) {
                vote++;
            } else {
                vote--;
            }
        }

        return current;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna