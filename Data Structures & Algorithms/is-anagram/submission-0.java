class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        if (String.valueOf(sChar).equals(String.valueOf(tChar))) {
            return true;
        } else {
            return false;
        }
    }
}
