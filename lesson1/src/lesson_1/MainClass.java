package lesson_1;

public class MainClass {
    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = 1000;
        int i1 = 100000;
        long l1 = 1000000000000L;
        float f1 = 12.5f;
        double d1 = 12.55;
        boolean bool1 = true;
        char c1 = 'a';
    }
    public static int calculate(int a, int b, int c, int d) {
        return a*(b+(c/d));
    }
    public static boolean task10and20(int x1, int x2) {
        if ((x1 + x2) >= 10 && (x1 + x2) <= 20){
         return true;
        }else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if( x >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }
    public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void greetings(String name) {
        name = "Артем";
        System.out.println("Привет, + name");
    }
}
