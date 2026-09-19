class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        char[] Arr = s.toCharArray();
        char[] Brr = t.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        if (Arrays.equals(Brr, Arr)) {
            return true;
        }

        return false;
    }
}