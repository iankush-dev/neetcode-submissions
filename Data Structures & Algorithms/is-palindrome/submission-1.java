class Solution {
    public boolean isPalindrome(String s) {
        String validStr = s.replace(" ", "")
            .trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            
        boolean isPalindrome = true;

        for (int i=0, j=validStr.length()-1; i<j; i++, j--) {
            if (validStr.charAt(i) != validStr.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
