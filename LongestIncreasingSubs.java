
/*
LEETCODE -- 300 

FIND THE LONGEST INCREASING SUBSEQUENCE

THIS PROBLEM IS SOLVED USING DYNAMIC PROGRAMMING 
WE HAVE USED ONE ARRAY MEMO TO STORE THE VALUES AT EACH INDEX OF LONGEST INCREASING SUBSEQUENCE
THEN USING TWO POINTERS I AND J AND CHECKS IF ELEMENT AT I IS GREATER THAN ELEMENT AT J, IF SO THEN
CHECK IN THE MEMO ARRAY THAT IF MEMO[J]+1  IS GREATER THAN MEMO[I] THEN MEMO[I] WILL BE EQUAL TO MEMO[J]+1.
THIS MEANS THAT MEMO[I] WILL WILL BE THE MINIMUM LONGEST INCREASING SUBS. AND STORE IT AND MOVE FURTHER 
AND IF CONDITION MATCHES THEN USE THE PREVIOUS VALUE TO CALCULATE THE NEXT ONE 

 */

class LongestIncreasingSubs{
    public int subsequence(int nums[]){
        int [] memo = new int[nums.length];

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(memo[j]+1 > memo[i]){
                        memo[i] = memo[j]+1;
                    }
                }
            }
        }

        int maxIdx = 0;
        for(int i=0;i<memo.length;i++){
            if(memo[i]>memo[maxIdx]){
                maxIdx = i;
            }
        }

        return memo[maxIdx] + 1;
    }
}