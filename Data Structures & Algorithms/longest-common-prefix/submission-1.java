class Solution {
    public String longestCommonPrefix(String[] strs) {
        String reference = strs[0];

        for(int i=0; i<reference.length(); i++){
            char currentChar = reference.charAt(i);
            System.out.println("currentChar: " + currentChar);
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i)!= currentChar){
                    return reference.substring(0,i);
                }
            }
        }

        return reference;
    }
}