package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Task7 {

    private static HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
        put("{", 0);
        put("[", 1);
        put("(", 2);
    }};

   private static  HashMap<String, Integer> closeBrackets = new HashMap<String, Integer>() {{
        put("}", 0);
        put("]", 1);
        put(")", 2);
    }};

    private static Stack<String> stack = new Stack<>();
    private static String result = "correct";

    public static String checkLine(List<String> lines) {

        for (String inLine: lines) {

            for (int i = 0; i < inLine.length(); i++) {

                char character = inLine.charAt(i);
                String symbol = Character.toString(character);

                if (openBrackets.containsKey(symbol)) {
                    stack.push(symbol);
                } else if (closeBrackets.containsKey(symbol)) {
                    if (stack.empty() || !openBrackets.get(stack.pop()).equals(closeBrackets.get(symbol))) {
                        result = "incorrect";
                    }
                }
            }
        }

        return result;
    }

}
