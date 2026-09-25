class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
      ArrayList<Integer> ans = new ArrayList<>();
      
      int Max =0;
      int Min =1000000000;
      
      for(int i=0;i<arr.length;i++){
          Max = Math.max(Max,arr[i]);
          Min = Math.min(Min,arr[i]);
      }
          ans.add(Min);
      ans.add(Max);
  
      
      return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna