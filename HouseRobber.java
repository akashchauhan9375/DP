
/*
LEETCODE -- 198 HOUSE ROBBER
IN THIS WE ARE GIVEN HOUSES WITH MONEY WE HAVE TO ROB MAX MONEY SUCH THAT NO TWO HOUSE SHOULLD BE ROBBED.

JUST USE THE FORMULA --> total loot at house n = MAX(loot[n-2]+loot[n],loot[n-1]).
IDEA BEHIND THIS FORMULA IS THAT WE ARE TRYING TO FIND THE MAXIMUM FROM TWO ALTERNATE HOUSE AND CURRENT HOUSE AND 
STORING IN THE ARRAY TO CALCULATE THE FURTHER VALUES AND AT LAST WE WILL ABLE TO CALCULATE THE MAXIMUM VALUE AFTER 
TRAVERSING AND CHECKING THE WHOLE GIVEN ARRAY.
 */



class HouseRobber{
    public static int Rob(int arr[]){
        if(arr.length<2){
            return arr[0];
        }

        int [] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);

        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(dp[i-2]+arr[i],dp[i-1]);
        }

        return dp[dp.length-1];
    }
}