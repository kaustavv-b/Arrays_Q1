class Arrays_Q1 {
    public int subarraySum(int[] nums, int k) {
        int start = 0, end = 0, ans = 0, n=nums.length;
        while (start<n) {
            int sum = 0;
            for(int i=start; i<=end && i<n; i++)
                sum += nums[i];
            if (sum==k){
                ans++;
                end++;
            } 
            else if (sum<k)
                end++;
            else{
                start++;
                if (start > end) {
                    end = start;
                }
            }
            if (end >= n) {
                start++;
                end = start;
            }
        }
        return ans;
    }
}
