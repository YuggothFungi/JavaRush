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

        /*
        Так как числа примерно поровну делятся на положительные и отрицательные, то можно упростить чтение сделав вложенное условие:
        if (nNum > 0) // теперь мы работаем только с положительными числами
            {if (nNum % 2 == 0)
                {System.out.println("положительное чётное число")}
            else
                {System.out.println("положительное нечётное число")} // не надо делать дополнительную проверку
            }
        else if (nNum < 0) // теперь мы работаем только с отрицательными числами
            {if (nNum % 2 == 0)
                {System.out.println("отрицательное чётное число")}
            else
                {System.out.println("отрицательное нечётное число")} // опять не надо делать дополнительную проверку
            }
        else {System.out.println("ноль");} // в самых редких случаях нам будет попадаться ноль, поэтому он в конце
        
        p.s. Ещё мне казалось в нотации Java есть {} для обозначения блоков. Но если уже можно без них, то код будет ещё чище и меньше.
        У тебя здесь пример не показательный, но если представить, что вместо reader.readLine() у тебя приходит массив из тысячи значений, которые тебе нужно разложить по кучкам
        (вместо вывода строки, соответственно), то можно засечь время выполнения и посмотреть, какой код будет дольше выполняться.
        */
        
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
