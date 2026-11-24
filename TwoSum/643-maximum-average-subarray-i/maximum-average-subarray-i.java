class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double ans = 0;
        int sum = 0;

        // Calculate first window sum
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        ans = (double) sum / k;

        // Slide the window
        for(int i = k; i < nums.length; i++) {

            sum = sum - nums[i-k] + nums[i];

            double avg = (double) sum / k;

            if(avg > ans) {
                ans = avg;
            }
        }

        return ans;
    }
}