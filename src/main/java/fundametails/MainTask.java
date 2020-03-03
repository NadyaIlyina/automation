package fundametails;

import java.util.*;

/**
 * Реализовать следующие программы:
 *
 * 1.     Приветствовать любого пользователя при вводе его имени через командную строку.
 *
 * 2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
 *
 * 3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 *
 * 4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 *
 * 5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

public class MainTask {

    public static void tasks(String[] args) {

        System.out.println("Main Task \n Task 1:");
        System.out.println("Input you name");

        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Task 2:");
        System.out.println("Args before reverse: " + Arrays.toString(args));

        List listOfArgs = Arrays.asList(args);
        Collections.reverse(listOfArgs);

        String[] reversed = (String[]) listOfArgs.toArray(args);
        System.out.println("Args after reverse: " + Arrays.toString(reversed));

        System.out.println("Task 3:");
        System.out.println("Input number:");

        int n = in.nextInt();

        System.out.println("In each line: ");

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("In one line: ");
        for (int i = 0; i < n; i++) {
            System.out.print(random.nextInt() + "  ");
        }

        System.out.println("\n Task 4:");
        int sum = 0, m = 1;

        System.out.println("Args: " + Arrays.toString(args) + " ");
        for (String arg : args) {
            sum += Integer.parseInt(arg);
            m *= Integer.parseInt(arg);
        }

        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + m);

        System.out.println("Task 5:");
        System.out.println("Input number from 1 to 12:");
        n = in.nextInt();

        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        if (n > 0)
            System.out.println(months.get(n-1));
        else
            System.out.println("Incorrect number");

    }
}
