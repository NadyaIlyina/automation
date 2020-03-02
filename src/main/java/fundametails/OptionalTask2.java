package fundametails;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
 *
 * 1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 *
 * 2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 *
 * 3.     Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 *
 * 4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */
public class OptionalTask2 {

    public static void start() {

        System.out.println("\n \n Optional Task \n Input n:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] a = new int[n][n];

        int min = -50, max = 65;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = min + random.nextInt(max - min + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 1:");
        System.out.println("Input k(number of row): ");
        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[k - 1][i] < a[k - 1][j]) {
                    int tmp = a[k - 1][i];
                    a[k - 1][i] = a[k - 1][j];
                    a[k - 1][j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 4:");

        int maxNumber = -100;
        int indexI = 0, indexJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maxNumber < a[i][j]) {
                    maxNumber = a[i][j];
                    indexI = i;
                    indexJ = j;
                }

            }
        }
        System.out.println("max = " + maxNumber);
        int[][] matrix = new int[n - 1][n - 1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                matrix[i][j] = 0;
            }
        }

        int new_i = 0, new_j = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != indexI) {
                    if (j != indexJ) {
                        matrix[new_i][new_j] = a[i][j];
                        ++new_j;
                    }
                } else {
                    --new_i;
                    break;
                }
            }
            ++new_i;
            new_j = 0;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
