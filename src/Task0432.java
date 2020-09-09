import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Task0432 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String smth = reader.readLine();
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        int a = 1;
        while (a <= nNum) {
            System.out.println(smth);
            a++;
        }
    }
}