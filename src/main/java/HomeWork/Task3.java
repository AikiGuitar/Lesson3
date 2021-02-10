package HomeWork;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        String s = "Vladimir";

        int increment = 0;

        while (increment < 5) {

            System.out.println(increment + "Vladimir");
            increment++;
        }
    }
}