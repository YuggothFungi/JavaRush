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