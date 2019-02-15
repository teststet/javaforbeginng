/* Задача №5: Таблица умножения Задание
Необходимо вывести на экран таблицу умножения для введённого пользователем числа. Использовать циклы запрещено.
*/
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = in.nextInt();
        System.out.println("Таблица умножения с числом " + i);
        System.out.println("1 * " + i + " = " + i*1);
        System.out.println("2 * " + i + " = " + i*2);
        System.out.println("3 * " + i + " = " + i*3);
        System.out.println("4 * " + i + " = " + i*4);
        System.out.println("5 * " + i + " = " + i*5);
        System.out.println("6 * " + i + " = " + i*6);
        System.out.println("7 * " + i + " = " + i*7);
        System.out.println("8 * " + i + " = " + i*8);
        System.out.println("9 * " + i + " = " + i*9);
        System.out.println("10 * " + i + " = " + i*10);
    }
}
