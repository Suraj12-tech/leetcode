class Solution {
    public int subarraySum(int[] arr, int k) {
        
        int ans =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
          for(int j=i;j<arr.length;j++){
            sum =sum+arr[j];
            if(sum==k){
                ans++;
            }
          }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna