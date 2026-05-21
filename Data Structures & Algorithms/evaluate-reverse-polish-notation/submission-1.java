class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String token : tokens){
            try {
                st.push(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                int num2 = st.pop();
                int num1 = st.pop();

                switch (token) {
                    case "+": st.push(num1 + num2); break;
                    case "-": st.push(num1 - num2); break;
                    case "*": st.push(num1 * num2); break;
                    case "/": st.push(num1 / num2); break;
                }

            }
        }
        return st.pop();
    }
}
