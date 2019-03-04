/*Задача №18: Выгрузка данных из файла, проверка и перезапись
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
import java.io.*;

public class Task18 {
    public static void main (String args[]) {
        String StrOut;
        int num = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt")))
        {
            while ((StrOut = br.readLine()) != null) {
                System.out.println(StrOut);
                num++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        System.out.println("Вы можете ввести " + num + " строк");

        String StrIn;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter("text.txt"))
        {
            for(int  i = 0; i < num; i++){
                System.out.print(": ");
                if((i+1) == num) {
                    StrIn = br.readLine();
                    fw.write(StrIn);
                    break;
                }
                StrIn = br.readLine()+ "\r\n";
                fw.write(StrIn);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
