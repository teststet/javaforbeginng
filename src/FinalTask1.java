/*Итоговая задача №1 Задание
Ввести с консоли число в бинарном формате.
Перевести его в int и вывести на экран. Необходимо использовать циклы,
нельзя использования готовые методы языка Java,
для перевода числа из одной системы счисления в другую.
*/

import java.util.Scanner;

class FinalTask1 {
    public static void main(String[] args) {
        System.out.print("Введите число в бинарном формате: ");
        Scanner in = new Scanner(System.in);
        String BinStr = in.nextLine();

        int sum = 0;
        int a = 0;

        //Преобразование строки в массив символов
        char[] CharMas = BinStr.toCharArray();

        for(int i = CharMas.length-1; i > -1; i--) {
            if(CharMas[i] == '1') {
                sum = (int) (sum + Math.pow(2,a));
            } else sum = sum + 0;
            a++;
        }

        System.out.print("Число в десятичной системе: "+sum);

    }
}
