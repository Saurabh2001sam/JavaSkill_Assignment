import java.util.Stack;

public class BalancedParenthesis {

    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            if (ch == ')' || ch == '}' || ch == ']') {
                if (st.empty()) {
                    return false;
                }

                if (!isMatchingPair(st.pop(), ch)) {
                    return false;
                }
            }

        }

        if (st.empty())
            return true;
        else {
            return false;
        }
    }

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "{([])}";
        if (isBalanced(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}