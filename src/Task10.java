/*Задание №10: Ввод/вывод данных для матрицы
Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
 */
import java.util.Scanner;

public class Task10 {
    public static void main(String args[]) {
        int mas[][] = new int[3][3];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Введите число для элемента матрицы[" + (i+1) + "]" + "[" + (j+1) + "]: ");
                mas[i][j] = in.nextInt();
            }
        }

        System.out.println("Вывод первой строки матрицы, где каждый элемент умножается на 3");

        for(int j = 0; j < 3; j++) {
            System.out.println("Элемент [1][" + (j+1) + "]: " + mas[0][j]*3);
            //System.out.print(mas[0][j]*3 + " ");
        }
    }
}
