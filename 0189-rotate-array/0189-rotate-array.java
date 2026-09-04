class Solution {
    public void rotate(int[] arr, int k) {
        k = k % arr.length;
      int temp[]=new int[arr.length];
        for(int i=0;i<k;i++)
        {
            temp[i]=arr[arr.length-k+i];
        }
        for(int j=k;j<=arr.length-1;j++)
        {
            temp[j]=arr[j-k];
        }
        for(int p=0;p<arr.length;p++)
        {
            arr[p]=temp[p];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna