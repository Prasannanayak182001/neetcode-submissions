class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> HM = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            HM.put(c, HM.getOrDefault(c, 0) + 1); 
            i++;
        }

        int j  = 0;

        while( j < t.length()){
            char c = t.charAt(j); // Fixed: Look up characters from 't', not 's'
            
            // If character isn't in map, or its count is already 0, it's not an anagram
            if (!HM.containsKey(c) || HM.get(c) == 0) {
                return false;
            }
            
            HM.put(c, HM.get(c) - 1);
            j++;
        }

        return true;

    }
}
