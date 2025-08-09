class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int c = 0;                  // left pointer
        int c1 = s1.length() - 1;    // right pointer

        while (c <= c1) {
            if (s1.charAt(c) == s1.charAt(c1)) {
                c++;
                c1--;
            } else {
                return false;
            }
        }
        return true;
    }
}
