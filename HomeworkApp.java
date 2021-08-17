package lesson1;

public class HomeworkApp {


    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Bananaaaaaa");

        checkSumSign();

        printColour(105);
        printColour(50);
        printColour(-1);

        compareNumbers();
    }




    public static void checkSumSign() {
        int a = 10;
        int b = 15;
        if (a + b >= 0)
        {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отридцательная");
        }
    }

    public static void printColour(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");

        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b)
        {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }


}