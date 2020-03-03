package collections;

import collections.AudioRecord.domain.Disc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Звукозапись. Определить иерархию музыкальных композиций. Записать
 * на диск сборку. Подсчитать продолжительность. Провести перестановку
 * композиций диска на основе принадлежности к стилю. Найти композицию,
 * соответствующую заданному диапазону длины треков.
 * <p>
 * 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
 * <p>
 * 7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок.
 * Использовать стек.
 */
public class Main {

    private static Task7 task7 = new Task7();
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

    public static void main(String[] args) {

        Disc disc = new Disc();
        disc.initDisk();
        disc.sortings();

        List<String> lines = Arrays.asList(SONNET.split("\n"));
        System.out.println("\nСтихотворение как список: ");
        lines.forEach(System.out::println);

        lines.sort(Task4.sortSonnet());
        System.out.println("\nОтсортированное стихотворение: ");
        lines.forEach(System.out::println);

        List<String> line = new ArrayList<>();
        line.add("{([])}");
        System.out.println("\n" + line);
        System.out.println("\nПрвильность расстановки скобок: " + task7.checkLine(line));

    }
}
