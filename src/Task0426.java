import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Task0426 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum > 0 && (nNum % 2) == 1)
            System.out.println("положительное нечетное число");
        else
        if (nNum > 0 && (nNum % 2) == 0)
            System.out.println("положительное четное число");
        else
        if (nNum < 0 && (nNum % 2) == -1)
            System.out.println("отрицательное нечетное число");
        else
        if (nNum < 0 && (nNum % 2) == 0)
            System.out.println("отрицательное четное число");
        else
            System.out.println("ноль");
    }
}