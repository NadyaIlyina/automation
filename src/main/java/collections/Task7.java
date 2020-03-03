package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class Task7 {

    private HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
        put("{", 0);
        put("[", 1);
        put("(", 2);
    }};

   private HashMap<String, Integer> closeBrackets = new HashMap<String, Integer>() {{
        put("}", 0);
        put("]", 1);
        put(")", 2);
    }};

    private Stack<String> stack = new Stack<>();

    private String result = "верно";

    public String checkLine(List<String> lines) {

        for (String inLine: lines) {

            IntStream.range(0, inLine.length()).forEach(i -> {

                char character = inLine.charAt(i);
                String symbol = Character.toString(character);

                if (openBrackets.containsKey(symbol)) {
                    stack.push(symbol);
                }
                else if (closeBrackets.containsKey(symbol)) {

                    if (stack.empty() || !openBrackets.get(stack.pop()).equals(closeBrackets.get(symbol))) {
                        result = "неверно";
                    }
                }
            });
        }

        return result;
    }

}
