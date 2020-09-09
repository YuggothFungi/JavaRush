import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное число
*/

public class Task0428 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        String sNum2 = reader.readLine();
        int nNum2 = Integer.parseInt(sNum2);
        String sNum3 = reader.readLine();
        int nNum3 = Integer.parseInt(sNum3);

        int count = 0;

        if (nNum1 > 0)
            count++;
        if (nNum2 > 0)
            count++;
        if (nNum3 > 0)
            count++;
        System.out.println(count);
    }
}
