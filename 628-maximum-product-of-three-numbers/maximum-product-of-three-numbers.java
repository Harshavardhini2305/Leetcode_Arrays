class Solution {
    public int maximumProduct(int[] nums) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

      int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;

        for(int num : nums){

            if(num>first){
                third = second;
                second = first;
                first= num;
            }
            else if(num>second){
                third = second;
                second=num;
            }
            else if(num>third){
                third=num;
            }
            if(min1>num){
                min2=min1;
                min1=num;
            }else if(min2>num){
                min2=num;
            }
        }

        int res = Math.max((first)*(second)*(third),min1*min2*first);

        return res;
        
    }
}