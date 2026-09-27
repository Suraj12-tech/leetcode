class Solution {
    static int sumOfDigits(int digit) {
      int ans =0;
      
      while(digit !=0){
          int check = digit %10;
          ans = ans + check;
          digit = digit / 10;
      }
      
      return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna