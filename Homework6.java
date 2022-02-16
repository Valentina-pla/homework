package lesson1;

public class Homework6 {


    public abstract class Animals {

        abstract void run(int length);

        abstract void swim(int length);

    }

    class Cat extends Animals {

        private final int maxRun = 200;

        @Override
        void run(int length) {
            if (length <= maxRun) {
                System.out.println("Cat runs " + length + "m");
            } else {
                System.out.println("Cat cant runs more than" + maxRun + "m");

            }
        }

        @Override
        void swim(int length) {
            System.out.println("Cat cant swim ");
        }
    }

    class Dog extends Animals {
        private final int maxRun = 500;
        private final int maxSwim = 10;

        @Override
        void run(int length) {
            if (length <= maxRun) {
                System.out.println("Dog runs " + length + "m");
            } else {
                System.out.println("Dog cant runs more than" + maxRun + "m");

            }
        }

        @Override
        void swim(int length) {
            if (length <= maxSwim) {
                System.out.println("Dog swim " + length + "m");
            } else {
                System.out.println("Dog cant swim more than" + maxSwim + "m");
            }
        }

    }
}
