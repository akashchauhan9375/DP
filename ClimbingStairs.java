
/*
 
LEETCODE -- 70 
FIND THE POSSIBLE NO OF WAYS REQUIRED TO CLIMB THE N STAIRS GIVEN THAT YOU CAN CLIMB 1 OR 2 STEPS AT A TIME

IN THIS QUESTION WE WILL USE THE DYNAMIC PROGRAMMING WE WILL CALCULATE THE POSSIBLE WAYS AT N WITH THE 
HELP OF PREVIOUSLY STORED RESULT. FOR EXAMPLE POSSIBLE WAYS TO CLIMB THE 5 STAIRS WILL BE THE WAYS TO
CLIMB 4 STAIRS + WAYS TO CLIMB 3 STAIRS, THIS WILL BE THE DESIRED RESULT.


 */



class ClimbingStairs {
    public static int Steps(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


}

