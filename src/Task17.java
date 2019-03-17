/*Задача №17: Запись данных в файл Задание
Необходимо написать программу, которая будет записывать текстовые данные,
введенные с экрана, в файл .txt. Запись ввести в файл до тех пор,
пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.*/

import java.io.*;

public class Task17 {
    public static void main (String args[]) {
        String strIn;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("text.txt"))
        {
            do {
                System.out.print(": ");
                strIn = br.readLine();

                if (strIn.equals("stop")) break;

                strIn = strIn + "\r\n";
                fw.write(strIn);
            } while (true);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}