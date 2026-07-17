class Solution {
    public String decodeString(String s) {

        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> sk = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                st.push(num);
                sk.push(curr);

                curr = new StringBuilder();
                num = 0;
            }

            else if (ch == ']') {

                int repeat = st.pop();
                StringBuilder prev = sk.pop();

                while (repeat-- > 0) {
                    prev.append(curr);
                }

                curr = prev;
            }

            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
