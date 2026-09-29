class Solution {
    static boolean armstrongNumber(int n) {
        int digit = n;
        int digit_1 = digit % 10;
         digit = digit / 10;
         
         int digit_2 = digit % 10;
         digit = digit/10;
         
         int digit_3 = digit % 10;
         digit = digit/10;
         
         int c_1=1;
         int c_2=1;
         int c_3=1;
         
         for(int i=1;i<=3;i++){
             c_1 = c_1 * digit_1;
             c_2 = c_2 * digit_2;
             c_3 = c_3 * digit_3;
         }
         
         int final_sum = c_1 + c_2 + c_3;
         
         if(final_sum == n){
             return true;
         }
         
         return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna