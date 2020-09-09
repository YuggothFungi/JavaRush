import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Task0429 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        String sNum2 = reader.readLine();
        int nNum2 = Integer.parseInt(sNum2);
        String sNum3 = reader.readLine();
        int nNum3 = Integer.parseInt(sNum3);

        int count1 = 0;
        int count2 = 0;

        if (nNum1 < 0)
            count2++;
        if (nNum2 < 0)
            count2++;
        if (nNum3 < 0)
            count2++;

        if (nNum1 > 0)
            count1++;
        if (nNum2 > 0)
            count1++;
        if (nNum3 > 0)
            count1++;
        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);
    }
}