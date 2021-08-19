package lesson1;

public class HomeworkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 20));
        System.out.println(checkSum(10, 10));
        printIsPositive(-1);
        printIsPositive(10);
        System.out.println(isPositive(10));
        System.out.println(isPositive(-2));
cycle("count", 10);

    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >=10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void printIsPositive(int a){
        if (a >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }
 public static boolean isPositive(int a) {
        if(a >=0) {
            return true;
        } else  {
            return false;
        }
 }
 public static void cycle(String str, int count) {
        for(int i = 0; i< count; i++) {
         System.out.println(str);

     }
 }
}