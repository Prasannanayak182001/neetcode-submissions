class Solution {

    public String encode(List<String> strs) {

    String encode = "";

    for(String s : strs) {
        encode += s.length() + "#" + s;
    }

    return encode;
}

    public List<String> decode(String str) {

    ArrayList<String> ans = new ArrayList<>();

    int i = 0;

    while(i < str.length()) {

        int j = i;

        // Find the delimiter after the length
        while(str.charAt(j) != '#') {
            j++;
        }

        int length = Integer.parseInt(str.substring(i, j));

        // Start of actual string
        int start = j + 1;

        // End of actual string
        int end = start + length;

        ans.add(str.substring(start, end));

        i = end;
    }

    return ans;
}
}
