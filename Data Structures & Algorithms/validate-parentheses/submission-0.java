class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
    Map<Character, Character> map = new HashMap<>();
    
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    for (char c : s.toCharArray()) {
        if (map.containsKey(c)) {               
            if (st.isEmpty() || !st.pop().equals(map.get(c))) {
                return false;
            }
        } else {
            st.push(c);                    
        }
    }

    return st.isEmpty();
    }
}
