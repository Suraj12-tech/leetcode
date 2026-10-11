class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int ans = 0;
        int maxfeq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            maxfeq = Math.max(maxfeq, map.get(ch));

            while (i - left + 1 - maxfeq > k) {
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna