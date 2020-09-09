/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Task0434 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        while (a <= 10) {
            while (b <= 10) {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println();
            a++;
            b = 1;
        }
    }
}