package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //task1
        int [] arrFirst = new int [3];
        arrFirst [0] = 1;
        arrFirst [1] = 2;
        arrFirst [2] = 3;
        float [] arrSecond =  {1.57f, 7.654f, 9.986f};
        int[] arrThird = {2, 3, 5, 7, 11, 13};

        //task2
        int i = 0;
        while (i < arrFirst.length - 1) {
            System.out.print(arrFirst[i]+",");
            i++;
        }
        System.out.print(arrFirst[i]);
        System.out.print("\n");

        int j = 0;
        while (j < arrSecond.length - 1) {
            System.out.print(arrSecond[j]+",");
            j++;
        }
        System.out.print(arrSecond[j]);
        System.out.print("\n");

        int k = 0;
        while (k < arrThird.length - 1) {
            System.out.print(arrThird[k]+",");
            k++;
        }
        System.out.print(arrThird[k]);
        System.out.print("\n");

        //task3


        while (i > 0) {
            System.out.print(arrFirst[i]+",");
            i--;
        }
        System.out.print(arrFirst[i]);
        System.out.print("\n");

        while (j > 0) {
            System.out.print(arrSecond[j]+",");
            j--;
        }
        System.out.print(arrSecond[j]);
        System.out.print("\n");

        while (k > 0) {
            System.out.print(arrThird[k]+",");
            k--;
        }
        System.out.print(arrThird[k]);
        System.out.print("\n");


        //task4

        for (i = 0; i < arrFirst.length; i++){
            if (arrFirst[i] % 2 != 0){
                arrFirst[i] = arrFirst[i] + 1;
                System.out.print(arrFirst[i]+" " );
            } else {
                System.out.print(arrFirst[i]+" ");
            }
        }
    }
}