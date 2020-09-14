import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Task0427 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        
        /*
        Про унификацию, о которой говорил Вова. Если посмотреть предыдущий пример и этот, то единственное отличие у нас - это определение "значности" числа вместо положительности. 
        В твоём примере кода, мы ограничены условием задачи и он не расширяется, а количество проверок у нас увеличивается. Однако, значение "значности" мы можем рассчитывать
        в самом конце уже при выводе строки, должно получиться что-то вроде:
        System.out.println("четное " + String.valueof(sNum.length) + "-значное число") // получится четное 1-значное, 2-значное, 3-значное, можно записать и более аккуратно,
        но смысл в том, чтобы не делать лишних проверок там, где они вовсе не обязательны.
        И проверка в конце на ноль пропала! Сейчас при нуле вообще ничего не выведет.
        */ 
        
        if ((nNum % 2) == 0 && sNum.length() == 1 && nNum != 0)
            System.out.println("четное однозначное число");
        else
        if ((nNum % 2) == 1 && sNum.length() == 1 && nNum != 0)
            System.out.println("нечетное однозначное число");
        else
        if ((nNum % 2) == 0 && sNum.length() == 2)
            System.out.println("четное двузначное число");
        else
        if ((nNum % 2) == 1 && sNum.length() == 2)
            System.out.println("нечетное двузначное число");
        else
        if ((nNum % 2) == 0 && sNum.length() == 3)
            System.out.println("четное трехзначное число");
        else
        if ((nNum % 2) == 1 && sNum.length() == 3)
            System.out.println("нечетное трехзначное число");
    }
}
