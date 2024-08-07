import java.util.Stack;

public class prefixToPostfix {
    static String prefixToPostfixConversion(String s){
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')
                    || ((int) ch >= 48 && (int) ch <= 57)) {
                st.push("" + ch);
            }
            else {
                String v1 = st.pop();
                String v2 = st.pop();
                st.push(v1 + v2 + ch);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(prefixToPostfixConversion("+-a^bcd"));
    }
}
