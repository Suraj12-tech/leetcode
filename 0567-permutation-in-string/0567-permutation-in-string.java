class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int left = 0;
        boolean ans = false;

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);

            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);
            } else {
                map1.put(ch1, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {

            char ch2 = s2.charAt(i);

            if (map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2) + 1);
            } else {
                map2.put(ch2, 1);
            }

            while (i - left + 1 > s1.length()) {

                char remove = s2.charAt(left);
                map2.put(remove, map2.get(remove) - 1);
                if (map2.get(remove) == 0) {
                    map2.remove(remove);
                }

                left++;
            }

            if (i - left + 1 == s1.length()) {
                if (map1.equals(map2)) {
                    ans = true;
                }
            }

        }

        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna