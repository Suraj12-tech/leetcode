class Solution {
    public void rotate(int[] arr, int k) {

        if(k%arr.length==0){
            return ;
        } else if(k>arr.length){
            k = k % arr.length;
        }
        int[] ans = new int[arr.length];

        for (int j = k; j > 0; j--) {
            ans[k-j] = arr[arr.length -j];
        }

        for (int i = k; i < arr.length; i++) {
            ans[i] = arr[i - k];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna