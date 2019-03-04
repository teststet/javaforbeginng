/*Задача №16: Выгрузка данных из файла на экран Задание
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */

import java.io.*;

public class Task16 {
    public static void main (String args[]) {
        String StrOut;
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt")))
        {
            while ((StrOut = br.readLine()) != null) {
                System.out.println(StrOut);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
