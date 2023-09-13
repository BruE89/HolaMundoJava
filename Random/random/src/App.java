import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(isValid("([)"));

    }

    public static boolean isValid(String s) {

        Stack<Character> lista = new Stack<>();

        for (char e : s.toCharArray()) {

            if (e == '(' || e == '{' || e == '[') {
                
                lista.push(e);

            } else if ( e == ']' && !lista.isEmpty() && lista.peek() == '[') {

                lista.pop();
                
            } else if ( e == '}' && !lista.isEmpty() && lista.peek() == '{') {

                lista.pop();
                
            } else if ( e == ')' && !lista.isEmpty() && lista.peek() == '(') {

                lista.pop();
                
            }else {

                return false;

            }
            
        }

        return true;

    }

}
