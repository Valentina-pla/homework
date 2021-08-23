package lesson1.homework.git;

public class HomeworkApp3 {
    public static void main(String[] args) {
        //ЗАдание 1/
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0
        };
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
//Задание 2/
        int[] array2 = new int[100];
        for (int j = 0; j < 100; j++) {
            array2[j] = j + 1;
        }
        //Задание 3/
        int[] array3={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k=0; k< array3.length; k++) {
            if (array3[k]<6) {
                array3[k]*=2;
            }
        }
        //Задание 4/
        int[][] array4=new int [4][4];
        for (int g=0; g< array4.length; g++) {
            array4[g][g]=1;
        }



    }
//Задание 5/
    public static int[] createArray (int len, int initialValue) {
        int[] array = new int[len];
        for (int j = 0; j < len; j++) {
            array[j] = initialValue;
        }
        return array;
    }

}