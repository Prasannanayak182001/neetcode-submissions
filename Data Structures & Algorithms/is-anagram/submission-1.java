class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char[] Os = s.toCharArray();

        char[] Ot = t.toCharArray();

        Arrays.sort(Os);
        Arrays.sort(Ot);

        for(int i = 0; i < Os.length; i++){
            if(Os[i] != Ot[i]) return false;
        }

        return true;

    }
}
