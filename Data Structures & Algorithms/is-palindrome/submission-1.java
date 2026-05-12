class Solution {
    public boolean isPalindrome(String s) {
        String trimString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(trimString).reverse().toString().toLowerCase();
        return trimString.equals(reverse);
    }
}
