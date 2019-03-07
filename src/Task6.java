/* Задача №6: Отработка арифметических операций Задание
Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры X,Y,Z
2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите число y: ");
        int y = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите число z: ");
        int z = in.nextInt();

        int sa = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел x,y,z = " + sa);

        sa = sa / 2;

        if(sa > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
