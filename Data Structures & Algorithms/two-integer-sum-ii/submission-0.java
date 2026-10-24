class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> HM = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){

            if(HM.containsKey(target - numbers[i])){
                return new int[]{HM.get(target - numbers[i]) + 1, i + 1};
            }
            else{
                HM.put(numbers[i], i);
            }
        }

        return new int[]{-1,-1};
    }
}