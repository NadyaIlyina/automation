package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
 *
 * 7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок.
 * Использовать стек.
 */
public class Main {

    private static Task7 task7=new Task7();

    private static final String SONNET =
            "One day I wrote her name upon the strand,\n" +
                    "But came the waves and washed it away:\n" +
                    "Again I write it with a second hand,\n" +
                    "But came the tide, and made my pains his prey.\n" +
                    "Vain man, said she, that doest in vain assay,\n" +
                    "A mortal thing so to immortalize,\n" +
                    "For I myself shall like to this decay,\n" +
                    "And eek my name be wiped out likewise.\n" +
                    "Not so, (quod I) let baser things devise\n" +
                    "To die in dust, but you shall live by fame:\n" +
                    "My verse, your virtues rare shall eternize,\n" +
                    "And in the heavens write your glorious name.\n" +
                    "Where when as death shall all the world subdue,\n" +
                    "Our love shall live, and later life renew.";

    private static Task4 task4 = new Task4();

    public static void main(String[] args) {

        List<String> lines = Arrays.asList(SONNET.split("\n"));
        System.out.println(lines);

        Collections.sort(lines, task4.sortSonnet());
        System.out.println(lines);

        List<String> line = new ArrayList<>();
        line.add("{([])}");
        System.out.println("Task 7: " + task7.checkLine(line));

    }
}
