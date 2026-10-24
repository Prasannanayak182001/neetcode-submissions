class Solution {
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];

        for(int i =0; i< nums.length; i++){
            int ans = 1;
            int j = 0;

            while(j < nums.length){
                if(i == j){
                    j++;
                    continue;
                }
                else{
                    
                    ans = ans * nums[j];
                    j++;
                }
            }

            res[i] = ans;

        }

    return res;

        
    }
}  
