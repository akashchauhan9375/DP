
/*
LEETCODE -- 322
COIN CHANGE PROBLEM(IMPORTANT PROBLEM AS ASKED IN MANY COMPANIES).
WE WILL BE SOLVING THIS PROBLEM USING DYNAMIC PROBLEM. WE WILL CREATE AN ARRAY COUNT FROM 0 TO AMOUNT
AND WILL STORE THE AT EACH INDEX THAT HOW MUCH MINIMUM COINS ARE REQUIRED TO MAKE THE iTH AMOUNT.
FURTHER WE WILL PROCEED IN THE SAME WAY AND AT LAST INDEX WE WILL GET THE MINIMUM NO OF COINS 
REQUIRED TO SUM UP THE TO THE AMOUNT.

 */

class CoinChange{
    public static int Coin(int [] coins, int amount){
         if(amount<1){
            return 0;
         }

         int [] count = new int[amount+1];

         for(int i=1;i<=amount;i++){
            count[i] = Integer.MAX_VALUE;

            for(int coin:coins){
                if(i<=coin && count[i-coin] != Integer.MAX_VALUE){
                    count[i] = Math.min(count[i],count[i-coin]+1);
                }
            }
        }
        return count[amount];
    }
    
}