class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> check = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && !check.contains(arr1[i])){
                    check.add(arr1[i]);
                }
            }
        }


        for(int i=0;i<check.size();i++){
            System.out.println(check.get(i));
        }

        int[] ans = new int[check.size()];
        for(int i=0;i<check.size();i++){
            ans[i]=check.get(i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna