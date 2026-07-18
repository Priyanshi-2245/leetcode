class Solution {
    public void reverseString(char[] s) {
        reversed(s, 0, s.length - 1);
    }

    public void reversed(char[] s, int l, int r) {

        if (l >= r) {
            return;
        }

        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        reversed(s, l + 1, r - 1);
    }
}