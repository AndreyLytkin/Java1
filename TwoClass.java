public class TwoClass {

    public static void main(String[] args) {

        System.out.println ("Результат первого задания - " + Metod1(7, 7));
        Metod2(- 10);
        System.out.println ("Результат третьего задания - " + Metod3(- 5));
        Metod4("Добрый день", 5);

    }

    public static boolean Metod1(int a, int b) {

        return (10 <= a + b) && (a + b <= 20);
    }

    public static void Metod2(int a) {
        if (a >= 0) {
            System.out.println( a + " - Положительное число");
        } else {
            System.out.println( a + " - Отрицательное число");
        }
    }

    public static boolean Metod3(int i){

        return i <= 0;
    }

    public static void Metod4 (String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println("Строка №" + i + ":" + a);
        }
    }


}

