import java.util.*;

public class prefix_equaion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> st = new Stack<>();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            }
            else {
                int a = st.pop();
                int b = st.pop();
                switch (ch) {
                    case '+':
                        st.push(a + b);
                        break;
                    case '-':
                        st.push(a - b);
                        break;

                    case '*':
                        st.push(a * b);
                        break;

                    case '/':
                        st.push(a / b);
                        break;
                }
            }
        }

        System.out.println("Answer: " + st.pop());
    }
}
