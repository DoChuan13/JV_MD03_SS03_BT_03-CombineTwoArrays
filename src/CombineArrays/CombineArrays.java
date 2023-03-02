package CombineArrays;

import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array A
        System.out.print("Input Array A length: ");
        int sizeA = input.nextInt();
        int[] arrA = new int[sizeA];
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("Input element A at %d: ", (i + 1));
            arrA[i] = input.nextInt();
        }
        System.out.print("Current Array A: ");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + "\t");
        }

        //Array B
        System.out.print("\n\nInput Array B length: ");
        int sizeB = input.nextInt();
        int[] arrB = new int[sizeB];
        for (int i = 0; i < arrB.length; i++) {
            System.out.printf("Input element B at %d: ", (i + 1));
            arrB[i] = input.nextInt();
        }
        System.out.print("Current Array B: ");
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + "\t");
        }

        //Array C - combine
        int[] arrC = new int[sizeA + sizeB];
        System.out.print("\n\nNew Array C: ");

        for (int i = 0; i < arrC.length; i++) {
            if (i < sizeA) {
                arrC[i] = arrA[i];
            } else {
                arrC[i] = arrB[i - sizeA];
            }
            System.out.print(arrC[i] + "\t");
        }

    }
}
