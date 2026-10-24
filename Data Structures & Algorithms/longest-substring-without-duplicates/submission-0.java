class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;

        int maxLength = 0;
        HashMap<Character, Integer> HM = new HashMap<>();

        while(r < s.length()){

            if(!HM.containsKey(s.charAt(r))){
                HM.put(s.charAt(r),r);
                r++;
            }
            else{
                l = Math.max(l,HM.get(s.charAt(r))+1);
                HM.put(s.charAt(r), r);
                r++;
            }

            int max = r - l;
            if(max > maxLength) maxLength = max;
        }

        return maxLength;
        
    }
}
