class Solution {
    public int sumOfSquares(int[] arr) {
        int ans =0;
        for(int i=1;i<arr.length+1;i++){
            if(arr.length%i==0){
                int temp = arr[i-1]*arr[i-1];
                ans = ans + temp;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna